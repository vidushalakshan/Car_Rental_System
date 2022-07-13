package lk.ijse.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CustomerDTO {
    @Id
    private String cus_ID;
    private String name;
    private String address;
    private String mobile_No;
    private String driving_Licens;
}
