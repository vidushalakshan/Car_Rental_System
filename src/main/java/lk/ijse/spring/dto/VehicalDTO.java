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
    private String car_Availability;
    private String car_Brand;
    private String car_Type;
    private String car_Color;
    private double Transmission_Type;
    private int no_Of_Passenger;
    private String daily_Rate;
    private String monthly_Rate;
    private String price_ExtraKM;
    private String damage_Price;
}
