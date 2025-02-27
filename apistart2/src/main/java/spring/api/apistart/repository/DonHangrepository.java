package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.DonHang;

public interface DonHangrepository extends JpaRepository<DonHang, Integer> {
}
