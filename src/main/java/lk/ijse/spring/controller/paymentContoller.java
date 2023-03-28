package lk.ijse.spring.controller;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.dto.PaymentDTO;
import lk.ijse.spring.service.PaymentService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/payment")
@CrossOrigin
public class paymentContoller {

    @Autowired
    PaymentService paymentService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllPayment(){
        return  new ResponseUtil(200, "OK",paymentService.getAllPayment());
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil addPayment(@ModelAttribute PaymentDTO paymentDTO) {
        paymentService.savePayment(paymentDTO);
        return new ResponseUtil(200, "Payment added Successfully", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updatePayment(@RequestBody PaymentDTO paymentDTO) {
        paymentService.updatePayment(paymentDTO);
        return new ResponseUtil(200, "Payment Update Successfully", null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deletePayment(@RequestParam String id) {
        paymentService.deletePayment(id);
        return new ResponseUtil(200, "Payment Delete Successfully", null);
    }

    @GetMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchPayment(@PathVariable String search) {
        return new ResponseUtil(200, "OK", paymentService.searchPayment(search));
    }

    @GetMapping(path = "/generate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil generateId() {
        return new ResponseUtil(200, "OK", paymentService.generatePaymentID());
    }

}
