package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.VehicalDTO;

public interface VehicalService {

    void saveVehical(VehicalDTO vehicalDTO);

    void deleteVehical(String vehicalID);

    void updateVehical(VehicalDTO vehicalDTO);

    CustomerDTO searchVehical(String id);
}
