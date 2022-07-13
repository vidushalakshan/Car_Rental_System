package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);

    void deleteCustomer(String customerID);

    void updateCustomer(CustomerDTO customerDTO);

    List<CustomerDTO> searchCustomer(String id, String name);

    List<CustomerDTO> getAllCustomers();

    String generateCustomerId();
}
