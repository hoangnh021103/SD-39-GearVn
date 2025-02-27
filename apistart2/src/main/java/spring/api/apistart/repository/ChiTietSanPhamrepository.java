package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.ChiTietSanPham;
@Repository
public interface ChiTietSanPhamrepository extends JpaRepository<ChiTietSanPham, Integer> {
}
