/*
package spring.controller;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.dto.CustomerDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

//@WebAppConfiguration
//@ContextConfiguration(classes = {WebAppConfig.class})
//@ExtendWith(SpringExtension.class)
//@Transactional // dont commit anything to database // just test is it working properly or not
class CustomerControllerTest {
    @Test
    public void testDTO(){
        CustomerDTO customerDTO = new CustomerDTO();
    }


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
}*/
