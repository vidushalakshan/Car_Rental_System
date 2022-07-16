package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.StafDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Staf;
import lk.ijse.spring.repo.StafRepo;
import lk.ijse.spring.service.StafService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StafServiceImpl implements StafService {

    @Autowired
    private StafRepo stafRepo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveDriver(StafDTO stafDTO) {
        if (!stafRepo.existsById(stafDTO.getStaf_ID())){
            stafRepo.save(mapper.map(stafDTO, Staf.class));
        }else {
            throw new RuntimeException("Driver Already Exist");
        }
    }

    @Override
    public void deleteDriver(String driverID) {
        if (stafRepo.existsById(driverID)){
            stafRepo.deleteById(driverID);
        }else {
            throw new RuntimeException("Please check the Driver ID.. No Such Driver..!");
        }
    }

    @Override
    public void updateDriver(StafDTO stafDTO) {
        if (stafRepo.existsById(stafDTO.getStaf_ID())){
            stafRepo.save(mapper.map(stafDTO,Staf.class));
        }else {
            throw new RuntimeException("Please check the Driver ID... No Such Driver to Update..!");
        }
    }

    @Override
    public StafDTO searchDriver(String id) {
        return null;
    }

    @Override
    public List<StafDTO> getAllDrivers() {
        return null;
    }
}
