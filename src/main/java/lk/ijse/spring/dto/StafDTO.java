package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class StafDTO {
    private String staf_ID;
    private String name;
    private String address;
    private String mobile_No;
    private String rype;
}
