package spring.api.apistart.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.GioHang;

public interface GioHangRepository extends JpaRepository<GioHang, Integer> {
    Page<GioHang> findByKhachHang_EmailContaining(String email, Pageable pageable);
}