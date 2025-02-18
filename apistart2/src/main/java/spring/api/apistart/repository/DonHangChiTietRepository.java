package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.DonHangChiTiet;

public interface DonHangChiTietRepository extends JpaRepository<DonHangChiTiet, Integer> {
}
