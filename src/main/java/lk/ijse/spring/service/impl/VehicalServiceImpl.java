package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.VehicalDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Vehical;
import lk.ijse.spring.repo.VehicalRepo;
import lk.ijse.spring.service.VehicalService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


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
            vehicalRepo.save(modelMappers.map(vehicalDTO, Vehical.class));
        }else {
            throw new RuntimeException("Customer Already Exist");
        }
    }

    @Override
    public void deleteVehical(String vehicalID) {
        if (vehicalRepo.existsById(vehicalID)){
            vehicalRepo.deleteById(vehicalID);
        }else {
            throw new RuntimeException("Please check the Vehical ID.. No Such Vehical..!");
        }
    }

    @Override
    public void updateVehical(VehicalDTO vehicalDTO) {
        if (vehicalRepo.existsById(vehicalDTO.getRe_Num())){
            vehicalRepo.save(modelMappers.map(vehicalDTO,Vehical.class));
        }else {
            throw new RuntimeException("Please check the Vehical ID... No Such Vehical to Update..!");
        }
    }

    @Override
    public VehicalDTO searchVehical(String id) {
        if (vehicalRepo.existsById(id)){
            return modelMappers.map(vehicalRepo.findById(id).get(),VehicalDTO.class);
        }else {
            throw new RuntimeException("No Vehical; For " + id + " ..!");
        }
    }


    @Override
    public List<VehicalDTO> getAllVehical() {
        return modelMappers.map(vehicalRepo.findAll(), new TypeToken<List<VehicalDTO>>(){

        }.getType());
    }
}
