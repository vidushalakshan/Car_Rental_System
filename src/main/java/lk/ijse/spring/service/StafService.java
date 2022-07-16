package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.StafDTO;

import java.util.List;

public interface StafService {

    void saveDriver(CustomerDTO customerDTO);

    void deleteDriver(String customerID);

    void updateDriver(CustomerDTO customerDTO);

    StafDTO searchDriver(String id);

    List<StafDTO> getAllDrivers();
}
