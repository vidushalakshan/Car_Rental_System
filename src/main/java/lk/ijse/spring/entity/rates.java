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
public class rates {
    @Id
    private String rate_ID;
    private double monthly_Rate;
    private double daily_Rate;
    private double free_KM_Month;
    private double getFree_KM_Day;
    private double price_Per_Extra_Km;
}
