package spring.api.apistart.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.ChiTietHoaDon;

public interface ChiTietHoaDonRepository extends JpaRepository<ChiTietHoaDon, Integer> {
    Page<ChiTietHoaDon> findByHoaDon_MaDonHangContainingOrSanPham_TenContaining(String maDonHang, String sanPhamTen, Pageable pageable);
}