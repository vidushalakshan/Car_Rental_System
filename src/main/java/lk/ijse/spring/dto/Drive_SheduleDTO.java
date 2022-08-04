package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Drive_SheduleDTO {
    private String driver_id;
    private String driver_name;
    private Date driver_date;
    private Time driver_time;
}
