package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "nhan_vien")
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tai_khoan_id", referencedColumnName = "id")
    private TaiKhoan taiKhoan;

    @Column(name = "ho_ten", nullable = false, length = 50)
    private String hoTen;

    @Column(name = "ngay_sinh")
    @Temporal(TemporalType.DATE)
    private Date ngaySinh;
    @Column(name = "gioi_tinh", length = 10)
    private String gioiTinh;
    @Column(name = "so_dien_thoai", length = 20)
    private String soDienThoai;
    @Column(name = "dia_chi", length = 255)
    private String diaChi;
}
