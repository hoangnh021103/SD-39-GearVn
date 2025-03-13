package spring.api.apistart.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.HoaDon;

public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {
    Page<HoaDon> findByMaDonHangContainingOrKhachHang_EmailContaining(String maDonHang, String email, Pageable pageable);
}