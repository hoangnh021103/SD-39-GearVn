package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ma_giam_gia")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_giam_gia", nullable = false, length = 255)
    private String tenGiamGia;

    @Column(name = "loai_giam_gia", nullable = false)
    private Boolean loaiGiamGia;

    @Column(name = "gia_tri_giam", nullable = false)
    private Float giaTriGiam;

    @Column(name = "don_hang_toi_thieu", nullable = false)
    private Integer donHangToiThieu;

    @Column(name = "giam_gia_toi_da")
    private Integer giamGiaToiDa;

    @Column(name = "gioi_han_su_dung")
    private Integer gioiHanSuDung;

    @Column(name = "mo_ta", length = 255)
    private String moTa;

    @Column(name = "ngay_bat_dau", nullable = false)
    private LocalDateTime ngayBatDau;

    @Column(name = "ngay_ket_thuc", nullable = false)
    private LocalDateTime ngayKetThuc;
}
