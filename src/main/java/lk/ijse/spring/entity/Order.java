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
public class Order {
    @Id
    private String bookingI;
    private String cus_i;
    private String pick_Up_Dat;
    private String drop_of_Dat;
    private String pick_up_Tim;
    private String drop_off_Tim;
}
