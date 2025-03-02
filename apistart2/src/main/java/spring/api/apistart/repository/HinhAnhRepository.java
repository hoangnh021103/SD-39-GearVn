package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.HinhAnh;

public interface HinhAnhRepository extends JpaRepository<HinhAnh, Byte> {
}
