package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor // Constructor mặc định
@AllArgsConstructor // Constructor có tham số
@Entity
@Builder
@Table(name = "chi_tiet_don_hang")
public class DonHangChiTiet {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "don_hang_id")
    private DonHang donHang;

    @ManyToOne
    @JoinColumn(name = "san_pham_id")
    private SanPham sanPham;

    @Column(name = "so_luong")
    private Integer soLuong; //

    @Column(name = "gia")
    private Integer gia; //

    @Column(name = "thue")
    private Float thue; //

    @Column(name = "thanh_tien")
    private Integer thanhTien; //
}

