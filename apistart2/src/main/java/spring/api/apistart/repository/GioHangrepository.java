package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.GioHang;

public interface GioHangrepository extends JpaRepository<GioHang, Integer> {
}
