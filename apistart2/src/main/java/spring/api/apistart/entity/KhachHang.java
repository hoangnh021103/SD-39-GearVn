package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Entity
@Table(name = "khach_hang")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ho", nullable = false, length = 50)
    private String ho;

    @Column(name = "ten", nullable = false, length = 50)
    private String ten;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "sdt", nullable = false, length = 15)
    private String sdt;

    @Column(name = "ngay_sinh", nullable = false)
    private LocalDate ngaySinh;

    @Column(name = "gioi_tinh", nullable = false)
    private Byte gioiTinh; // 0: Nam, 1: Nữ, 2: Khác

    @Column(name = "tinh", nullable = false, length = 100)
    private String tinh;

    @Column(name = "huyen", nullable = false, length = 100)
    private String huyen;

    @Column(name = "xa", nullable = false, length = 100)
    private String xa;

    @Column(name = "dia_chi_chinh", nullable = false, length = 255)
    private String diaChiChinh;

    @Column(name = "dia_chi_phu", length = 255)
    private String diaChiPhu;

    @Column(name = "mat_khau", nullable = false, length = 255)
    private String matKhau;

    @Column(name = "trang_thai", nullable = false)
    private Byte trangThai = 0; // 0: Hoạt động, 1: Khóa, 2: Tạm dừng
}