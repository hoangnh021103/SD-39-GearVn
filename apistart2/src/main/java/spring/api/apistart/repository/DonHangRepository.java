package spring.api.apistart.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.api.apistart.dto.DonHangCustom;
import spring.api.apistart.entity.DonHang;

import java.util.List;

public interface DonHangRepository extends JpaRepository<DonHang,Integer>{
    @Query(value = "\t\t  SELECT dh.id, dh.dia_chi_giao_hang, dh.trang_thai, dh.ngay_tao, dh.ngay_cap_nhat,\n" +
            "               kh.id AS khach_hang_id, nv.id AS nhan_vien_id, mg.id AS ma_giam_gia_id\n" +
            "        FROM don_hang dh\n" +
            "        LEFT JOIN khach_hang kh ON dh.khach_hang_id = kh.id\n" +
            "        LEFT JOIN nhan_vien nv ON dh.nhan_vien_id = nv.id\n" +
            "        LEFT JOIN ma_giam_gia mg ON dh.ma_giam_gia_id = mg.id",nativeQuery = true)
    List<DonHangCustom> getAllDonHang();
}
