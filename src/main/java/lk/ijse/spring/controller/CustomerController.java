package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
@CrossOrigin
public class CustomerController {


    @Autowired
    CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllCustomer(){
        return  new ResponseUtil(200, "OK",customerService.getAllCustomers());
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil addCustomer(@ModelAttribute CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return new ResponseUtil(200, "Customer added Successfully", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.updateCustomer(customerDTO);
        return new ResponseUtil(200, "Customer Update Successfully", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        customerService.deleteCustomer(id);
        return new ResponseUtil(200, "Customer Delete Successfully", null);
    }

    @GetMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCustomer(@RequestParam String search) {
        return new ResponseUtil(200, "OK", customerService.searchCustomer(search, search));
    }

    @GetMapping(path = "/generate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil generateId() {
        return new ResponseUtil(200, "OK", customerService.generateCustomerId());
    }
}
