package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PaymentDTO {
    private String payment_ID;
    private String cus_ID;
    private String cardNumber;
    private String expiryDate;
    private String cvc;
    private double price;
}
