package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.MaGiamGia;
@Repository
public interface MaGiamGiarepository extends JpaRepository<MaGiamGia, Integer> {
}
