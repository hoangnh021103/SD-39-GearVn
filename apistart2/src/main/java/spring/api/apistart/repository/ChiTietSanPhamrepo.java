package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.api.apistart.dto.ChiTietSanPhamCustom;
import spring.api.apistart.entity.ChiTietSanPham;

import java.util.List;

public interface ChiTietSanPhamrepo extends JpaRepository<ChiTietSanPham,Integer> {
    @Query(value = "\tSELECT ctsp.id, ctsp.serial, ctsp.vi_xu_ly, ctsp.ram, ctsp.luu_tru,\n" +
            "       ctsp.card_do_hoa, ctsp.man_hinh, ctsp.do_phan_giai, ctsp.pin,\n" +
            "       ctsp.trong_luong, ctsp.he_dieu_hanh, ctsp.bao_hanh,\n" +
            "       sp.id AS san_pham_id, sp.ten AS san_pham_ten\n" +
            "FROM chi_tiet_san_pham ctsp\n" +
            "LEFT JOIN san_pham sp ON ctsp.san_pham_id = sp.id",nativeQuery = true)
    List<ChiTietSanPhamCustom> getAllCTSP();
}
