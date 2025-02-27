package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.DanhMuc;
@Repository
public interface DanhMucrepository extends JpaRepository<DanhMuc, Byte> {
}
