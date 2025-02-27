package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.TaiKhoan;

public interface TaiKhoanrepository extends JpaRepository<TaiKhoan, Integer> {
}
