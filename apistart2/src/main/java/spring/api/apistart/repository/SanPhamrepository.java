package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.SanPham;

public interface SanPhamrepository extends JpaRepository<SanPham, Integer> {
}
