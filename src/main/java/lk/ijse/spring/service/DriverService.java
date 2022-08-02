package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriversDTO;

import java.util.List;

public interface DriverService {
    void saveDriver(DriversDTO driversDTO);

    void deleteDriver(String driverId);

    void updateDriver(DriversDTO driversDTO);

    DriversDTO searchDriver(String id);

    List<DriversDTO> getAllDrivers();

    String generateDriverId();
}
