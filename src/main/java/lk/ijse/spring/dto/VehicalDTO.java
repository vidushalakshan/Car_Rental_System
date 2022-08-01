package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class VehicalDTO {
    private String re_Num;
    private String vehical_Type_ID;
    private String fuel_Type;
    private String color;
    private String Transmission_Type;
    private double running_Km;
    private int no_Of_Passenger;
    private String brand;
    private String status;

}
