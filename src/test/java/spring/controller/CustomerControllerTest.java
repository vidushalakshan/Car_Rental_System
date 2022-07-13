package spring.controller;

import lk.ijse.spring.config.WebAppConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Helitha Sri
 * @created 6/23/2022 - 12:07 PM
 * @project Spring POS
 */

@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class})
@ExtendWith(SpringExtension.class)
@Transactional // dont commit anything to database // just test is it working properly or not
class CustomerControllerTest {

    @Autowired
    CustomerService customerService;

    @Test
    void getAllCustomers() {
        customerService.getAllCustomers();
    }

    @Test
    void addCustomer(){
        CustomerDTO customerDTO = new CustomerDTO("C002", "Helitha", "Kandy", 5000.20);
        customerService.saveCustomer(customerDTO);
    }

    @Test
    void updateCustomer(){
        CustomerDTO customerDTO = new CustomerDTO("C003", "Helitha Sri", "Kandy, Nawalapitiya", 900);
        customerService.updateCustomer(customerDTO);
    }
}