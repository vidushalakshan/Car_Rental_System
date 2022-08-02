package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveAdmin(AdminDTO adminDTO) {
        if (!adminRepo.existsById(adminDTO.getAdmin_Id())){
           adminRepo.save(modelMapper.map(adminDTO, Admin.class));
        }else {
            throw new RuntimeException("Admin Already Exist");
        }
    }

    @Override
    public void deleteAdmin(String adminId) {
        if (adminRepo.existsById(adminId)){
            adminRepo.deleteById(adminId);
        }else {
            throw new RuntimeException("Please check the Admin ID.. No Such Admin..!");
        }
    }

    @Override
    public void updateAdmin(AdminDTO adminDTO) {
        if (adminRepo.existsById(adminDTO.getAdmin_Id())){
            adminRepo.save(modelMapper.map(adminDTO,Admin.class));
        }else {
            throw new RuntimeException("Please check the Admin ID... No Such Admin to Update..!");
        }
    }

    @Override
    public CustomerDTO searchAdmin(String id) {
        if (adminRepo.existsAdminById(id)) {
            return modelMapper.map(adminRepo.existsAdminById(id), new TypeToken<List<AdminDTO>>() {
            }.getType());
        } else {
            throw new RuntimeException("No Admin For " + id + "..!");
        }
    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        return modelMapper.map(adminRepo.findAll(), new TypeToken<List<AdminDTO>>(){

        }.getType());
    }

    @Override
    public String generateAdminId() {
        return null;
    }
}
