package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.SanPham;

@Repository
public interface SanPhamrepo extends JpaRepository<SanPham, Integer> {

}

