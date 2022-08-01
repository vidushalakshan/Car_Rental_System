package lk.ijse.spring.service.impl;

import lk.ijse.spring.config.WebAppConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;


@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class})
@ExtendWith(SpringExtension.class)
class CustomerServiceImplTest {

    @Test
    void saveCustomer() {
    }

    @Test
    void deleteCustomer() {
    }

    @Test
    void updateCustomer() {
    }

    @Test
    void searchCustomer() {
    }

    @Test
    void getAllCustomers() {
    }

    @Test
    void generateCustomerId() {
    }
}