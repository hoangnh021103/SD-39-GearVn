package spring.api.apistart.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
    Page<SanPham> findByTenContainingOrThuongHieu_TenContaining(String ten, String thuongHieuTen, Pageable pageable);
}