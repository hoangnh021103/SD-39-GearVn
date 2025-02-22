package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.api.apistart.dto.DonHangChiTietCustom;
import spring.api.apistart.entity.DonHangChiTiet;

import java.util.List;

public interface DonHangChiTietRepository extends JpaRepository<DonHangChiTiet, Integer> {
    @Query(value = "    SELECT dhct.id, dhct.so_luong, dhct.gia, dhct.thue, dhct.thanh_tien,\n" +
            "               dh.id AS don_hang_id, sp.id AS san_pham_id\n" +
            "        FROM chi_tiet_don_hang dhct\n" +
            "        LEFT JOIN don_hang dh ON dhct.don_hang_id = dh.id\n" +
            "        LEFT JOIN san_pham sp ON dhct.san_pham_id = sp.id",nativeQuery = true)
    List<DonHangChiTietCustom>getAllDHCT();
}
