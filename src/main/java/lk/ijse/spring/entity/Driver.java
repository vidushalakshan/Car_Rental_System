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
public class Driver {
    @Id
    private String driver_Id;
    private String driver_Name;
    private String driver_Address;
    private String driver_MobileNo;
    private String driver_Password;
    private String driver_Email;
}
