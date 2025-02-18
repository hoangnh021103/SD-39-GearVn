package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.NhanVien;
@Repository
public interface NhanVienrepo extends JpaRepository<NhanVien,Integer> {
}
