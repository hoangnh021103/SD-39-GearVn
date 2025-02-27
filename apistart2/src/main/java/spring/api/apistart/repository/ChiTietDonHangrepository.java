package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.ChiTietDonHang;
@Repository
public interface ChiTietDonHangrepository extends JpaRepository<ChiTietDonHang, Integer> {
}
