package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriversDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriversRepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriversRepo driversRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveDriver(DriversDTO driversDTO) {
        if (!driversRepo.existsById(driversDTO.getDriver_Id())){
            driversRepo.save(modelMapper.map(driversDTO, Driver.class));
        }else {
            throw new RuntimeException("Driver Already Exist");
        }
    }

    @Override
    public void deleteDriver(String driverId) {
        if (driversRepo.existsById(driverId)){
            driversRepo.deleteById(driverId);
        }else {
            throw new RuntimeException("Please check the Driver ID.. No Such Driver..!");
        }
    }

    @Override
    public void updateDriver(DriversDTO driversDTO) {
        if (driversRepo.existsById(driversDTO.getDriver_Id())){
            driversRepo.save(modelMapper.map(driversDTO,Driver.class));
        }else {
            throw new RuntimeException("Please check the Driver ID... No Such Driver to Update..!");
        }
    }

    @Override
    public DriversDTO searchDriver(String id) {
        if (driversRepo.existsById(id)) {
            return modelMapper.map(driversRepo.findById(id), new TypeToken<List<DriversDTO>>() {
            }.getType());
        } else {
            throw new RuntimeException("No Driver For " + id + "..!");
        }
    }

    @Override
    public List<DriversDTO> getAllDrivers() {
        return modelMapper.map(driversRepo.findAll(), new TypeToken<List<DriversDTO>>(){

        }.getType());
    }

    @Override
    public String generateDriverId() {
        return null;
    }
}
