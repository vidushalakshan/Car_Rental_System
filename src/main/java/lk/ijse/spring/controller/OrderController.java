package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.dto.OrderDTO;
import lk.ijse.spring.service.OrderService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/order")
@CrossOrigin
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllOrders() {
        return  new ResponseUtil(200, "OK",orderService.getAllOrders());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil addOrder(@ModelAttribute OrderDTO orderDTO) {
        orderService.saveOrder(orderDTO);
        return new ResponseUtil(200, "Booking added Successfully", null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteOrder(@RequestParam String id) {
        orderService.deleteOrder(id);
        return new ResponseUtil(200, "Booking Delete Successfully", null);
    }

}
