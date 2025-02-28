package spring.api.apistart.entity;



import jakarta.persistence.*;
import lombok.*;



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

    @Column(name = "so_luong", nullable = false)
    private Integer soLuong;

    @Column(name = "serial", nullable = false, length = 20)
    private String serial;

    @Column(name = "vi_xu_ly", nullable = false, length = 255)
    private String viXuLy;

    @Column(name = "ram", nullable = false, length = 50)
    private String ram;

    @Column(name = "luu_tru", nullable = false, length = 100)
    private String luu_tru;

    @Column(name = "card_do_hoa", length = 255)
    private String cardDoHoa;

    @Column(name = "man_hinh", nullable = false, length = 50)
    private String manHinh;

    @Column(name = "do_phan_giai", length = 100)
    private String doPhanGiai;

    @Column(name = "pin", length = 100)
    private String pin;

    @Column(name = "trong_luong") // Bỏ precision và scale
    private Double trongLuong;

    @Column(name = "he_dieu_hanh", length = 100)
    private String heDieuHanh;
}