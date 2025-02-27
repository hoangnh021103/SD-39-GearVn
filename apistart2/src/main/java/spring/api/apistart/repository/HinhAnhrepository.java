package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.HinhAnh;
@Repository
public interface HinhAnhrepository extends JpaRepository<HinhAnh, Byte> {
}
