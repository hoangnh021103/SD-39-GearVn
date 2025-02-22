package spring.api.apistart.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.api.apistart.dto.MaGiamGiaCustom;
import spring.api.apistart.entity.MaGiamGia;

import java.util.List;

public interface MaGiamGiaRepository extends JpaRepository<MaGiamGia, Integer> {
    @Query(value = "SELECT id, loai_giam_gia, gia_tri_giam, don_hang_toi_thieu, giam_gia_toi_da,\n" +
            "               gioi_han_su_dung, ngay_bat_dau, ngay_ket_thuc\n" +
            "        FROM ma_giam_gia",nativeQuery = true)
    List<MaGiamGiaCustom> getAllMaGiamGia();
}
