package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.PhuongThucThanhToan;
@Repository
public interface PhuongThucThanhToanrepository extends JpaRepository<PhuongThucThanhToan, Integer> {
}
