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
public class customer {
    @Id
    private String cus_ID;
    private String name;
    private String address;
    private String mobile_No;
    private String driving_Licens;
}
