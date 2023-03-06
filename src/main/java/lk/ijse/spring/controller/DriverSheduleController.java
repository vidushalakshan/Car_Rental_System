package lk.ijse.spring.controller;

import lk.ijse.spring.dto.Drive_SheduleDTO;
import lk.ijse.spring.service.Driver_SheduleService;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/shedule")
@CrossOrigin
public class DriverSheduleController {

    @Autowired
    Driver_SheduleService driver_sheduleService;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllShedule(){
        return  new ResponseUtil(200, "OK",driver_sheduleService.getAllShedule());
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil addDriverShedule(@ModelAttribute Drive_SheduleDTO drive_sheduleDTO) {
        driver_sheduleService.saveDriverShedule(drive_sheduleDTO);
        return new ResponseUtil(200, "Driver Shedule added Successfully", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateDriverShedule(@RequestBody Drive_SheduleDTO drive_sheduleDTO) {
        driver_sheduleService.updateDriverShedule(drive_sheduleDTO);
        return new ResponseUtil(200, "Driver Shedule Update Successfully", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteDriverShedule(@RequestParam String id) {
        driver_sheduleService.deleteDriverShedule(id);
        return new ResponseUtil(200, "Driver Shedule Delete Successfully", null);
    }

    @GetMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchDriverShedule(@RequestParam String search) {
        return new ResponseUtil(200, "OK", driver_sheduleService.searchDriverShedule(search));
    }
}
