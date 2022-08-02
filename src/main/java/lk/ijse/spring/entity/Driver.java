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
    private String Driver_Id;
    private String Driver_Name;
    private String Driver_Address;
    private String Driver_MobileNo;
    private String Driver_Password;
    private String Driver_Email;
}
