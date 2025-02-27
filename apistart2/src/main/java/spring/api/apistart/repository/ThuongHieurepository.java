package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.ThuongHieu;
@Repository
public interface ThuongHieurepository extends JpaRepository<ThuongHieu, Byte> {
}
