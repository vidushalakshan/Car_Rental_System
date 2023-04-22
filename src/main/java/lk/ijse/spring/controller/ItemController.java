package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/item")
@CrossOrigin
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllItems(){
        return  new ResponseUtil(200, "OK",itemService.getAllItems());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil addItem(@ModelAttribute ItemDTO itemDTO) {
         itemService.saveItem(itemDTO);
        return new ResponseUtil(200, "Payment added Successfully", null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteAdmin(@RequestParam String id) {
        itemService.deleteItem(id);
        return new ResponseUtil(200, "Payment Delete Successfully", null);
    }
}
