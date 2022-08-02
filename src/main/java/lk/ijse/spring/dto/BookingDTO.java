package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookingDTO {
    private String booking_ID;
    private String customer_ID;
    private String car_Id;
    private String driver_Id;
    private String pick_Up_Date;
    private String pick_up_Time;
    private String drop_of_Date;
    private String drop_off_Time;
    private String rent_Price;
}
