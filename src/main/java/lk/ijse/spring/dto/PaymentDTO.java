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
    private String drop_Of_Date;
    private String drop_Of_Last_Day;
    private String car_ID;
    private String customer_ID;
    private String Driver_ID;
    private String rent_Price;
    private String damaging_Price;
    private String discount;
    private String total_Price;
}
