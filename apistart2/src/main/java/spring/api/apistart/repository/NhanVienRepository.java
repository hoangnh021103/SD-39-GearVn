package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
}