package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicalType {
    @Id
    private String vehical_Type;
    private double loss_Damage_Waiver;
    private String type;
}
