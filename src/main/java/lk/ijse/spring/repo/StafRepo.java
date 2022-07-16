package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Staf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StafRepo extends JpaRepository<Staf, String> {
}
