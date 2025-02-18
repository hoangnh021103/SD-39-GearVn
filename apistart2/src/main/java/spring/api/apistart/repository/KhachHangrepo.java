package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.KhachHang;

@Repository
public interface KhachHangrepo extends JpaRepository<KhachHang,Integer> {
}
