package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AdminDTO {
    private String admin_Id;
    private String admin_Name;
    private String admin_Address;
    private String admin_MobileNo;
    private String admin_Password;
    private String admin_Email;
}
