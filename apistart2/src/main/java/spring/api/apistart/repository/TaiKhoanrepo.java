package spring.api.apistart.repository;
import org.springframework.data.jpa.repository.Query;
import spring.api.apistart.dto.TaiKhoanCustom;
import spring.api.apistart.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaiKhoanrepo extends JpaRepository<TaiKhoan, Integer> {
    @Query(value = "SELECT tk.id AS tai_khoan_id, tk.email, tk.mat_khau_hash, tk.vai_tro, tk.trang_thai\n" +
            "FROM tai_khoan tk",nativeQuery = true)
    List<TaiKhoanCustom>getAllTaiKhoan();
}

