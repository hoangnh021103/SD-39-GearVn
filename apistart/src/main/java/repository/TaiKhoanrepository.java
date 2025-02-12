package repository;

import Entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaiKhoanrepository extends JpaRepository<TaiKhoan,Integer> {
}
