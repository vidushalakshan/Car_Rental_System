package lk.ijse.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RatesDTO {
    private String rate_ID;
    private double monthly_Rate;
    private double daily_Rate;
    private double free_KM_Month;
    private double getFree_KM_Day;
    private double price_Per_Extra_Km;
}
