package lk.ijse.spring.service;

import lk.ijse.spring.dto.PayDTO;

import java.util.List;

public interface PayService {

    void savePay(PayDTO payDTO);

    List<PayDTO> getAllPay();
}
