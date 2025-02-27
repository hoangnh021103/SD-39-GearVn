package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.DonHang;
@Repository
public interface DonHangrepository extends JpaRepository<DonHang, Integer> {
}
