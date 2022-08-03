package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.VehicalDTO;

import java.util.List;

public interface VehicalService {

    void saveVehical(VehicalDTO vehicalDTO);

    void deleteVehical(String vehicalID);

    void updateVehical(VehicalDTO vehicalDTO);

    VehicalDTO searchVehical(String id);

    String generateCustomerId();

    List<VehicalDTO> getAllCustomers();
}
