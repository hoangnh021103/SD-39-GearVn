package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.HoaDon;

public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {
}