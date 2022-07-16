package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        if (!customerRepo.existsById(customerDTO.getCus_ID())){
            customerRepo.save(modelMapper.map(customerDTO, Customer.class));
        }else {
            throw new RuntimeException("Customer Already Exist");
        }
    }

    @Override
    public void deleteCustomer(String customerID) {
        if (customerRepo.existsById(customerID)){
            customerRepo.deleteById(customerID);
        }else {
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getCus_ID())){
            customerRepo.save(modelMapper.map(customerDTO,Customer.class));
        }else {
            throw new RuntimeException("Please check the Customer ID... No Such Customer to Update..!");
        }
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        if (customerRepo.existsById(id)){
            return modelMapper.map(customerRepo.findById(id).get(),CustomerDTO.class);
        }else {
            throw new RuntimeException("No Customer For " + id + " ..!");
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public String generateCustomerId() {
        return null;
    }
}
