package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

public interface AdminService {

    void saveAdmin(AdminDTO adminDTO);

    void deleteAdmin(String adminId);

    void updateAdmin(AdminDTO adminDTO);

    CustomerDTO searchAdmin(String id);

    List<AdminDTO> getAllAdmins();

    String generateAdminId();
}
