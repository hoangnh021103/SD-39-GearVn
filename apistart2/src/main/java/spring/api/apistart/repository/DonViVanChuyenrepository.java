package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.apistart.entity.DonViVanChuyen;

import java.util.List;
@Repository
public interface DonViVanChuyenrepository extends JpaRepository<DonViVanChuyen, Integer> {
}
