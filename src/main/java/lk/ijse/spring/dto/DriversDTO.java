package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DriversDTO {
    private String Driver_Id;
    private String Driver_Name;
    private String Driver_Address;
    private String Driver_MobileNo;
    private String Driver_Password;
    private String Driver_Email;
}
