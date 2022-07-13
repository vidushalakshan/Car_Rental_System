package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class vehicalTypeDTO {
    private String vehical_Type;
    private double loss_Damage_Waiver;
    private String type;
}
