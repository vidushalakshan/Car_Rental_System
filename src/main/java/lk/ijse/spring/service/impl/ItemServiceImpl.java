package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveItem(ItemDTO itemDTO) {
        if (!itemRepo.existsById(itemDTO.getItem_ID())){
            itemRepo.save(modelMapper.map(itemDTO, Item.class));
        }else {
            throw new RuntimeException("Item Already Exist");
        }
    }

    @Override
    public void deleteItem(String itemID) {
        if (itemRepo.existsById(itemID)){
            itemRepo.deleteById(itemID);
        }else {
            throw new RuntimeException("Please check the Payment ID.. No Such Payment..!");
        }
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return modelMapper.map(itemRepo.findAll(), new TypeToken<List<ItemDTO>>(){

        }.getType());
    }
}
