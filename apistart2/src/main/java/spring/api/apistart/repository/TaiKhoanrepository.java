package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.TaiKhoan;
@Repository
public interface TaiKhoanrepository extends JpaRepository<TaiKhoan, Integer> {
}
