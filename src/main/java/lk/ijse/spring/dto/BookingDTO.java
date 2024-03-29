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
    private String bookingID;
    private String cus_id;
    private String car_id;
    private String pick_Up_Date;
    private String drop_of_Date;
    private String pick_up_Time;
    private String drop_off_Time;
}
