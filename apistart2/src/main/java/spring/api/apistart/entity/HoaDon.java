package spring.api.apistart.entity;



import jakarta.persistence.*;
import lombok.*;


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
    @JoinColumn(name = "don_hang_id")
    private DonHang donHang;

    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;

    @Column(name = "tong_tien", nullable = false)
    private Integer tongTien;

    @Column(name = "ghi_chu", nullable = false, length = 255)
    private String ghiChu;

    @Column(name = "ngay_xuat", nullable = false)
    private LocalDateTime ngayXuat;
}
