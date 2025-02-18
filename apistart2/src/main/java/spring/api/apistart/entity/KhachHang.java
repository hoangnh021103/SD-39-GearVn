package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "khach_hang")
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tai_khoan_id", referencedColumnName = "id")
    private TaiKhoan taiKhoan;

    @Column(name = "ho_ten", nullable = false, length = 50)
    private String hoTen;

    @Column(name = "so_dien_thoai", length = 20)
    private String soDienThoai;

    @Column(name = "sdt_phu", length = 20)
    private String sdtPhu;

    @Column(name = "tinh", length = 50)
    private String tinh;

    @Column(name = "huyen", length = 50)
    private String huyen;

    @Column(name = "xa", length = 50)
    private String xa;

    @Column(name = "dia_chi", length = 255)
    private String diaChi;

    @Column(name = "dia_chi_phu", length = 255)
    private String diaChiPhu;
}

