package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,String> {
}
