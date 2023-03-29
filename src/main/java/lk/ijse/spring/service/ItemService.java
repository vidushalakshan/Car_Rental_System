package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;

import java.util.List;

public interface ItemService {

    void saveItem(ItemDTO itemDTO);

    void deleteItem(String itemID);

    List<ItemDTO> getAllItems();
}
