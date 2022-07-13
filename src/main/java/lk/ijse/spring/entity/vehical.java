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
public class vehical {
    @Id
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
