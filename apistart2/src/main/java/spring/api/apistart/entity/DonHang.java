package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor // Constructor mặc định
@AllArgsConstructor // Constructor có tham số
@Entity
@Builder
@Table(name = "don_hang")
public class DonHang {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "nhan_vien_id")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "ma_giam_gia_id")
    private MaGiamGia maGiamGia;

    @Column(name = "dia_chi_giao_hang")
    private String diaChiGiaoHang; //

    @Column(name = "trang_thai")
    private Integer trangThai; //

    @Column(name = "ngay_tao")
    private String ngayTao; //

    @Column(name = "ngay_cap_nhat")
    private String ngayCapNhat; //
}

