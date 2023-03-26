package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.BookingDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Booking;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.BookinRepo;
import lk.ijse.spring.service.BookingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookinRepo bookinRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveBooking(BookingDTO bookingDTO) {
        if (!bookinRepo.existsById(bookingDTO.getBookingID())){
            bookinRepo.save(modelMapper.map(bookingDTO, Booking.class));
        }else {
            throw new RuntimeException("Booking Already Exist");
        }
    }

    @Override
    public void deleteBooking(String bookingId) {
        if (bookinRepo.existsById(bookingId)){
            bookinRepo.deleteById(bookingId);
        }else {
            throw new RuntimeException("Please check the Booking ID.. No Such Booking..!");
        }
    }

    @Override
    public void updateBooking(BookingDTO bookingDTO) {
        if (bookinRepo.existsById(bookingDTO.getBookingID())){
            bookinRepo.save(modelMapper.map(bookingDTO,Booking.class));
        }else {
            throw new RuntimeException("Please check the Booking ID... No Such Booking to Update..!");
        }
    }

    @Override
    public BookingDTO searchBooking(String id) {
        if (bookinRepo.existsById(id)){
            return modelMapper.map(bookinRepo.findById(id).get(), BookingDTO.class);
        }else {
            throw new RuntimeException("No Booking For " + id + " ..!");
        }
    }

    @Override
    public List<BookingDTO> gatAllBooking() {
        return modelMapper.map(bookinRepo.findAll(), new TypeToken<List<BookingDTO>>(){

        }.getType());
    }

    @Override
    public String generateBookingId() {
        return null;
    }
}
