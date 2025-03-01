package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "don_hang_khach_vang_lai")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonHangKhachVangLai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "hoa_don_id")
    private HoaDon hoaDon;

    @Column(name = "ho", length = 50)
    private String ho;

    @Column(name = "ten", length = 50)
    private String ten;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "sdt", length = 15)
    private String sdt;

    @Column(name = "tinh", nullable = false, length = 100)
    private String tinh;

    @Column(name = "huyen", nullable = false, length = 100)
    private String huyen;

    @Column(name = "xa", nullable = false, length = 100)
    private String xa;

    @Column(name = "dia_chi_chinh", nullable = false, length = 255)
    private String diaChiChinh;
}