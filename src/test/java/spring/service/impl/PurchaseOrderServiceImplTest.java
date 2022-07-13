package spring.service.impl;

import lk.ijse.spring.config.WebAppConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Helitha Sri
 * @created 6/30/2022 - 12:27 AM
 * @project Spring POS
 */

@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class})
@ExtendWith(SpringExtension.class)
//@Transactional
class PurchaseOrderServiceImplTest {

    @Autowired
    PurchaseOrderService service;

    @Autowired
    ItemService itemService;

    @Test
    void purchaseOrder() {
        LocalDate now = LocalDate.now();
        System.out.println("date : "+now);

        /*ItemDTO table = new ItemDTO("I00-002", "Table2", 1000, 4000.00);
        itemService.saveItem(table);
        ItemDTO table2 = new ItemDTO("I00-003", "Table3", 1000, 4000.00);
        itemService.saveItem(table2);*/

        List<OrderDetailsDTO> dtos = new ArrayList<>();
        dtos.add(new OrderDetailsDTO("O00-002","I00-001",5,500.00,25000.00));
        dtos.add(new OrderDetailsDTO("O00-002","I00-002",5,600.00,30000.00));
        dtos.add(new OrderDetailsDTO("O00-002","I00-003",5,100.00,100.00));

        CustomerDTO customerDTO = new CustomerDTO("C00-001", "Heli", "Kandy", 500.00);

        OrdersDTO ordersDTO = new OrdersDTO("O00-002", LocalDate.now(), 5, 5000.00, 1000.00, customerDTO, dtos);
        service.purchaseOrder(ordersDTO);
    }

    @Test
    void deleteOrder() {
    }

    @Test
    void updateOrder() {
    }

    @Test
    void searchOrder() {
    }
}