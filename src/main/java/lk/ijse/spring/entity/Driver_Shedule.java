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
public class Driver_Shedule {
    @Id
    private String driver_id;
    private String driver_name;
    private String driver_date;
    private String driver_time;
}
