package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.DanhMuc;

public interface DanhMucrepository extends JpaRepository<DanhMuc, Byte> {
}
