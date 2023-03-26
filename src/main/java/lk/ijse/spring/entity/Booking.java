package lk.ijse.spring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    private String bookingID;
    private String cus_id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String pick_Up_Date;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String drop_of_Date;
    @JsonFormat(pattern = "HH-mm-ss")
    private String pick_up_Time;
    @JsonFormat(pattern = "HH-mm-ss")
    private String drop_off_Time;
}
