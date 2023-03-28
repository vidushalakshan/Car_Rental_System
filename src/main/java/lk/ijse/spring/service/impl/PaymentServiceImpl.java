package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.PaymentDTO;
import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.repo.PaymentRepo;
import lk.ijse.spring.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void savePayment(PaymentDTO paymentDTO) {
        if (!paymentRepo.existsById(paymentDTO.getCardNumber())){
            paymentRepo.save(modelMapper.map(paymentDTO, Payment.class));
        }else {
            throw new RuntimeException("Payment Already Exist");
        }
    }

    @Override
    public void deletePayment(String paymentID) {
        if (paymentRepo.existsById(paymentID)){
            paymentRepo.deleteById(paymentID);
        }else {
            throw new RuntimeException("Please check the Payment ID.. No Such Payment..!");
        }
    }

    @Override
    public void updatePayment(PaymentDTO paymentDTO) {
        if (paymentRepo.existsById(paymentDTO.getCardNumber())){
            paymentRepo.save(modelMapper.map(paymentDTO,Payment.class));
        }else {
            throw new RuntimeException("Please check the Payment ID... No Such Payment to Update..!");
        }
    }

    @Override
    public PaymentDTO searchPayment(String id) {
        if (paymentRepo.existsById(id)) {
            return modelMapper.map(paymentRepo.findById(id), new TypeToken<List<PaymentDTO>>() {
            }.getType());
        } else {
            throw new RuntimeException("No Payment For " + id + "..!");
        }
    }

    @Override
    public List<PaymentDTO> getAllPayment() {
        return modelMapper.map(paymentRepo.findAll(), new TypeToken<List<PaymentDTO>>(){

        }.getType());
    }

    @Override
    public String generatePaymentID() {
        return null;
    }
}
