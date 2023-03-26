package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookinRepo extends JpaRepository<Booking, String> {
}
