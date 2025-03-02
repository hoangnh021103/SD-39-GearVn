package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.ChiTietSanPham;

public interface ChiTietSanPhamRepository extends JpaRepository<ChiTietSanPham, Integer> {
}