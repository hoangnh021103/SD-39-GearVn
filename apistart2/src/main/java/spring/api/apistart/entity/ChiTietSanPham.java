package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chi_tiet_san_pham")
public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "san_pham_id", nullable = false)
    private SanPham sanPham;

    @Column(name = "serial", nullable = false, length = 20)
    private String serial;

    @Column(name = "vi_xu_ly", nullable = false, length = 255)
    private String viXuLy;

    @Column(name = "ram", nullable = false, length = 50)
    private String ram;

    @Column(name = "luu_tru", nullable = false, length = 100)
    private String luuTru;

    @Column(name = "card_do_hoa", length = 255)
    private String cardDoHoa;

    @Column(name = "man_hinh", nullable = false, length = 50)
    private String manHinh;

    @Column(name = "do_phan_giai", length = 100)
    private String doPhanGiai;

    @Column(name = "pin", length = 100)
    private String pin;

    @Column(name = "trong_luong", precision = 5, scale = 2)
    private BigDecimal trongLuong; // Sửa Double -> BigDecimal

    @Column(name = "he_dieu_hanh", length = 100)
    private String heDieuHanh;

    @Column(name = "bao_hanh")
    private Integer baoHanh;

    @PrePersist
    public void prePersist() {
        if (baoHanh == null) {
            baoHanh = 12;
        }
    }
}
