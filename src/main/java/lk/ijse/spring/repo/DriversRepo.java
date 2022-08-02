package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriversRepo extends JpaRepository<Driver,String> {
    boolean existsDriverById(String id);
}
