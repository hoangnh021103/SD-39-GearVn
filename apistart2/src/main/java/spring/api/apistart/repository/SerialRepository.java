package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.Serial;

public interface SerialRepository extends JpaRepository<Serial, Integer> {
}
