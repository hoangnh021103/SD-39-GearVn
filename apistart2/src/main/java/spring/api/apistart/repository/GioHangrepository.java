package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.GioHang;
@Repository
public interface GioHangrepository extends JpaRepository<GioHang, Integer> {
}
