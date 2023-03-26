package lk.ijse.spring.service;

import lk.ijse.spring.dto.BookingDTO;

import java.util.List;

public interface BookingService {

    void saveBooking (BookingDTO bookingDTO);

    void deleteBooking (String bookingId);

    void updateBooking (BookingDTO bookingDTO);

    BookingDTO searchBooking (String id);

    List<BookingDTO> gatAllBooking();

    String generateBookingId ();
}
