package spring.api.apistart.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.GioHangSpct;

public interface GioHangSpctRepository extends JpaRepository<GioHangSpct, Integer> {
    Page<GioHangSpct> findByChiTietSanPham_SanPham_TenContaining(String sanPhamTen, Pageable pageable);
}