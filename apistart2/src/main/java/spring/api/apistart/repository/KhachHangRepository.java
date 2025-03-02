package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.KhachHang;

public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
}