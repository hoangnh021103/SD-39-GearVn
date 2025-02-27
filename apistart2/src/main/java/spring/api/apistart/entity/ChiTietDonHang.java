package spring.api.apistart.entity;



import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "chi_tiet_don_hang")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietDonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "don_hang_id")
    private DonHang donHang;

    @ManyToOne
    @JoinColumn(name = "san_pham_id")
    private SanPham sanPham;

    @Column(name = "so_luong", nullable = false)
    private Integer soLuong;

    @Column(name = "gia", nullable = false)
    private Integer gia;

    @Column(name = "thue", nullable = false)
    private Float thue;

    @Column(name = "thanh_tien", nullable = false)
    private Integer thanhTien;
}
