package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Serial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "chi_tiet_san_pham_id")
    private ChiTietSanPham chiTietSanPham;

    @Column(name = "ten", nullable = false, length = 50)
    private String ten;

    @Column(name = "xuat_xu", length = 100)
    private String xuatXu;

    @Column(name = "trang_thai", nullable = false)
    private Byte trangThai = 0; // 0: Còn hàng, 2: Hết hàng
}