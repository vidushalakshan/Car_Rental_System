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
public class Admin {
    @Id
    private String admin_Id;
    private String admin_Name;
    private String admin_Address;
    private String admin_MobileNo;
    private String admin_Password;
    private String admin_Email;
}
