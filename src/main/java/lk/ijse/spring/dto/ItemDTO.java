package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ItemDTO {
   private String item_ID;
   private String cus_ID;
   private int card_number;
   private String item_Name;
   private int cvv;
   private double price;
}
