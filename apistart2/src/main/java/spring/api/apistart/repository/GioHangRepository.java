package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.GioHang;

public interface GioHangRepository extends JpaRepository<GioHang, Integer> {
}