package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.HoaDon;
@Repository
public interface HoaDonrepository extends JpaRepository<HoaDon, Integer> {
}
