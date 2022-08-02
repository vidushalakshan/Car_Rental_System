package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.VehicalDTO;
import lk.ijse.spring.entity.Vehical;
import lk.ijse.spring.repo.VehicalRepo;
import lk.ijse.spring.service.VehicalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Transactional
@Service
public class VehicalServiceImpl  implements VehicalService {

    @Autowired
    private VehicalRepo vehicalRepo;

    @Autowired
    private ModelMapper modelMappers;

    @Override
    public void saveVehical(VehicalDTO vehicalDTO) {
        if (!vehicalRepo.existsById(vehicalDTO.getRe_Num())){
 /*           vehicalRepo.save(modelMappers.map(vehicalDTO, Vehical.class));*/
        }else {
            throw new RuntimeException("Vehical Already Exist");
        }
    }

    @Override
    public void deleteVehical(String vehicalID) {
        if (vehicalRepo.existsById(vehicalID)){
            vehicalRepo.deleteById(vehicalID);
        }else {
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public void updateVehical(VehicalDTO vehicalDTO) {

    }

    @Override
    public CustomerDTO searchVehical(String id) {
        return null;
    }
}
