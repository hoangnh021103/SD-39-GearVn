package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.ChiTietSanPham;

public interface ChiTietSanPhamrepository extends JpaRepository<ChiTietSanPham, Integer> {
}
