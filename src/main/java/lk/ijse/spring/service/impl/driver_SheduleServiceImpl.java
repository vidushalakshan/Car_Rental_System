package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.Drive_SheduleDTO;
import lk.ijse.spring.dto.DriversDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.entity.Driver_Shedule;
import lk.ijse.spring.repo.Driver_SheduleRepo;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.service.Driver_SheduleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class driver_SheduleServiceImpl implements Driver_SheduleService {

    @Autowired
    private Driver_SheduleRepo driver_sheduleRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public void saveDriverShedule(Drive_SheduleDTO drive_sheduleDTO) {
        if (!driver_sheduleRepo.existsById(drive_sheduleDTO.getDriver_Id())){
            driver_sheduleRepo.save(modelMapper.map(drive_sheduleDTO, Driver_Shedule.class));
        }else {
            throw new RuntimeException("Driver Shedule Already Exist");
        }
    }

    @Override
    public void deleteDriverShedule(String sheduleId) {
        if (driver_sheduleRepo.existsById(sheduleId)){
            driver_sheduleRepo.deleteById(sheduleId);
        }else {
            throw new RuntimeException("Please check the Driver ID.. No Such Driver..!");
        }
    }

    @Override
    public void updateDriverShedule(Drive_SheduleDTO drive_sheduleDTO) {
        if (driver_sheduleRepo.existsById(drive_sheduleDTO.getDriver_Id())){
            driver_sheduleRepo.save(modelMapper.map(drive_sheduleDTO,Driver_Shedule.class));
        }else {
            throw new RuntimeException("Please check the Driver ID... No Such Driver to Update..!");
        }
    }

    @Override
    public Drive_SheduleDTO searchDriverShedule(String id) {
        return null;
    }

    @Override
    public List<Drive_SheduleDTO> getAllShedule() {
        return modelMapper.map(driver_sheduleRepo.findAll(), new TypeToken<List<Drive_SheduleDTO>>(){

        }.getType());
    }
}
