package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "chi_tiet_san_pham")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "san_pham_id")
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "mau_sac_id")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "hinh_anh_id")
    private HinhAnh hinhAnh;

    @Column(name = "ram", nullable = false, length = 50)
    private String ram;

    @Column(name = "cpu", nullable = false, length = 50)
    private String cpu;

    @Column(name = "o_cung", nullable = false, length = 50)
    private String oCung;

    @Column(name = "card_do_hoa", length = 255)
    private String cardDoHoa;

    @Column(name = "man_hinh", nullable = false, length = 50)
    private String manHinh;

    @Column(name = "do_phan_giai", length = 100)
    private String doPhanGiai;

    @Column(name = "ban_phim", nullable = false, length = 100)
    private String banPhim;

    @Column(name = "pin", length = 100)
    private String pin;

    @Column(name = "trong_luong", precision = 5)
    private Double trongLuong;

    @Column(name = "he_dieu_hanh", length = 100)
    private String heDieuHanh;
}