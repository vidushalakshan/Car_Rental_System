package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.StafDTO;

import java.util.List;

public interface StafService {

    void saveDriver(StafDTO stafDTO);

    void deleteDriver(String driverID);

    void updateDriver(StafDTO stafDTO);

    StafDTO searchDriver(String id);

    List<StafDTO> getAllDrivers();
}
