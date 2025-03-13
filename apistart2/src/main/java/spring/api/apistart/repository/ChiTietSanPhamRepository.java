package spring.api.apistart.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.ChiTietSanPham;

public interface ChiTietSanPhamRepository extends JpaRepository<ChiTietSanPham, Integer> {
    Page<ChiTietSanPham> findBySanPham_TenContainingOrMauSac_TenMauContaining(String sanPhamTen, String tenMau, Pageable pageable);
}