package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface StafService {

    void saveDriver(CustomerDTO customerDTO);

    void deleteDriver(String customerID);

    void updateDriver(CustomerDTO customerDTO);

    CustomerDTO searchDriver(String id);

    List<CustomerDTO> getAllDrivers();
}
