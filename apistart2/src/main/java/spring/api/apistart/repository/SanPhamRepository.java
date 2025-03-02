package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
}