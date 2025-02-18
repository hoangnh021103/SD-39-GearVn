package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor // Constructor mặc định
@AllArgsConstructor // Constructor có tham số
@Entity
@Builder
@Table(name = "ma_giam_gia")
public class MaGiamGia {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "loai_giam_gia")
    private Boolean loaiGiamGia;

    @Column(name = "gia_tri_giam")
    private String giaTriGiam;
    @Column(name = "don_hang_toi_thieu")
    private String donHangToiThieu;
    @Column(name = "giam_gia_toi_da")
    private String giamGiaToiDa; //

    @Column(name = "gioi_han_su_dung")
    private String gioiHanSuDung; //

    @Column(name = "ngay_bat_dau")
    private String ngayBatDau; //

    @Column(name = "ngay_ket_thuc")
    private String ngayKetThuc; //

}

