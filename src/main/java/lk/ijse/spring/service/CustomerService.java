package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);

    void deleteCustomer(String customerID);

    void updateCustomer(CustomerDTO customerDTO);

    CustomerDTO searchCustomer(String id);

    List<CustomerDTO> getAllCustomers();

    String generateCustomerId();
}
