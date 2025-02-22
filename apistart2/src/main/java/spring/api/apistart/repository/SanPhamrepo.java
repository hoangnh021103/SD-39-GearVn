package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring.api.apistart.dto.SanPhamCustom;
import spring.api.apistart.entity.SanPham;

import java.util.List;

@Repository
public interface SanPhamrepo extends JpaRepository<SanPham, Integer> {
    @Query(value = " SELECT sp.id, sp.ten, sp.hinh_dai_dien, sp.bao_hanh, sp.gia_nhap, sp.gia_ban, sp.thue, sp.mo_ta,\n" +
            "               dm.id AS danh_muc_id, dm.ten AS danh_muc_ten,\n" +
            "               ms.id AS mau_sac_id, ms.mau_json,\n" +
            "               ha.id AS hinh_anh_id, ha.hinh_json,\n" +
            "               th.id AS thuong_hieu_id, th.thuong_hieu_json,\n" +
            "               dm_cha.id AS danh_muc_cha_id, dm_cha.ten AS danh_muc_cha_ten\n" +
            "        FROM san_pham sp\n" +
            "        LEFT JOIN danh_muc dm ON sp.danh_muc_id = dm.id\n" +
            "        LEFT JOIN danh_muc_cha dm_cha ON dm.danh_muc_cha_id = dm_cha.id\n" +
            "        LEFT JOIN mau_sac ms ON sp.mau_sac_id = ms.id\n" +
            "        LEFT JOIN hinh_anh ha ON sp.hinh_anh_id = ha.id\n" +
            "        LEFT JOIN thuong_hieu th ON sp.thuong_hieu_id = th.id",nativeQuery = true)
    List<SanPhamCustom> getAllSanPham();
}

