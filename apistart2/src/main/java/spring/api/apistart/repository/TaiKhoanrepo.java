package spring.api.apistart.repository;
import spring.api.apistart.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaiKhoanrepo extends JpaRepository<TaiKhoan, Integer> {
}

