package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.api.apistart.dto.KhachHangCustom;
import spring.api.apistart.dto.NhanVienCustom;
import spring.api.apistart.entity.KhachHang;

import java.util.List;

@Repository
public interface KhachHangrepo extends JpaRepository<KhachHang,Integer> {
    @Query(value = "  SELECT kh.id, kh.ho_ten, kh.so_dien_thoai, kh.sdt_phu, kh.tinh, kh.huyen, kh.xa, kh.dia_chi, kh.dia_chi_phu,\n" +
            "               tk.id AS tai_khoan_id\n" +
            "        FROM khach_hang kh\n" +
            "        JOIN tai_khoan tk ON kh.tai_khoan_id = tk.id",nativeQuery = true)
    List<KhachHangCustom> getAllKhachHang();
}
