package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Booking {
    @Id
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
