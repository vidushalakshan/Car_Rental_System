package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Pay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayRepo extends JpaRepository<Pay, String> {

}
