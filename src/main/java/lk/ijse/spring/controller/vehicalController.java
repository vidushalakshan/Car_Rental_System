package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.VehicalDTO;
import lk.ijse.spring.service.VehicalService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vehical")
@CrossOrigin
public class vehicalController {

    @Autowired
    VehicalService vehicalService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllVehical(){
        return  new ResponseUtil(200, "OK",vehicalService.getAllVehical());
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil addVehical(@ModelAttribute VehicalDTO vehicalDTO) {
        vehicalService.saveVehical(vehicalDTO);
        return new ResponseUtil(200, "Vehical added Successfully", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateVehical(@RequestBody VehicalDTO vehicalDTO) {
        vehicalService.updateVehical(vehicalDTO);
        return new ResponseUtil(200, "Vehical Update Successfully", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteVehical(@RequestParam String id) {
        vehicalService.deleteVehical(id);
        return new ResponseUtil(200, "Vehical Delete Successfully", null);
    }

    @GetMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchVehical(@RequestParam String search) {
        return new ResponseUtil(200, "OK", vehicalService.searchVehical(search));
    }
}
