package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.PayDTO;
import lk.ijse.spring.entity.Pay;
import lk.ijse.spring.repo.PayRepo;
import lk.ijse.spring.service.PayService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayRepo payRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void savePay(PayDTO payDTO) {
        if (!payRepo.existsById(payDTO.getPayment_id())){
            payRepo.save(modelMapper.map(payDTO, Pay.class));
        }else {
            throw new RuntimeException("Payment Already Exist");
        }
    }

    @Override
    public List<PayDTO> getAllPay() {
        return modelMapper.map(payRepo.findAll(), new TypeToken<List<PayDTO>>(){

        }.getType());
    }
}
