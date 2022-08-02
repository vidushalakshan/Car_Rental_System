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
public class Vehical {
    @Id
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
