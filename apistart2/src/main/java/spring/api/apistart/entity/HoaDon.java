package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "hoa_don")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "nhan_vien_id")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "phuong_thuc_tt_id")
    private PhuongThucThanhToan phuongThucThanhToan;

    @ManyToOne
    @JoinColumn(name = "don_vi_vc_id")
    private DonViVanChuyen donViVanChuyen;

    @Column(name = "dia_chi_giao_hang", length = 255)
    private String diaChiGiaoHang;

    @Column(name = "tong_tien", nullable = false, precision = 10)
    private Double tongTien;

    @Column(name = "trang_thai", nullable = false)
    private Byte trangThai = 0; // 0: Chờ xác nhận, 1: Đã xác nhận, 2: Chờ vận chuyển, 3: Đang vận chuyển, 4: Hoàn thành, 5: Hủy

    @Column(name = "ghi_chu", length = 255)
    private String ghiChu;

    @Column(name = "ngay_tao", nullable = false)
    private LocalDateTime ngayTao;

    @Column(name = "ngay_cap_nhat", nullable = false)
    private LocalDateTime ngayCapNhat;

    @Column(name = "ma_don_hang", unique = true, length = 20)
    private String maDonHang;
}