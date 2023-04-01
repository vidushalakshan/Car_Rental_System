package lk.ijse.spring.controller;


import lk.ijse.spring.dto.PayDTO;
import lk.ijse.spring.service.PayService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pay")
@CrossOrigin
public class PayContoller {

    @Autowired
    PayService payService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllPay(){
        return  new ResponseUtil(200, "OK",payService.getAllPay());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil addPay(@ModelAttribute PayDTO payDTO) {
        payService.savePay(payDTO);
        return new ResponseUtil(200, "Payment added Successfully", null);
    }
}
