package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.HinhAnh;

public interface HinhAnhrepository extends JpaRepository<HinhAnh, Byte> {
}
