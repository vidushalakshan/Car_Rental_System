package lk.ijse.spring.controller;


import lk.ijse.spring.dto.BookingDTO;
import lk.ijse.spring.service.BookingService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/booking")
@CrossOrigin
public class BookingController {


    @Autowired
    BookingService bookingService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllBooking() {
        return new ResponseUtil(200,"OK",bookingService.gatAllBooking());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil addBooking (@ModelAttribute BookingDTO bookingDTO) {
        bookingService.saveBooking(bookingDTO);
        return new ResponseUtil(200,"Booking aded Successfully",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody BookingDTO bookingDTO) {
        bookingService.updateBooking(bookingDTO);
        return new ResponseUtil(200, "Customer Update Successfully", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        bookingService.deleteBooking(id);
        return new ResponseUtil(200, "Customer Delete Successfully", null);
    }

    @GetMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCustomer(@RequestParam String search) {
        return new ResponseUtil(200, "OK", bookingService.searchBooking(search));
    }

    @GetMapping(path = "/generate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil generateId() {
        return new ResponseUtil(200, "OK", bookingService.generateBookingId());
    }

}
