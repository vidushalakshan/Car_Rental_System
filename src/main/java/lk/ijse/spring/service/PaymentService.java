package lk.ijse.spring.service;

import lk.ijse.spring.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {

    void savePayment(PaymentDTO paymentDTO);

    void deletePayment(String paymentID);

    void updatePayment(PaymentDTO paymentDTO);

    PaymentDTO searchPayment(String id);

    List<PaymentDTO> getAllPayment();

    String generatePaymentID();
}
