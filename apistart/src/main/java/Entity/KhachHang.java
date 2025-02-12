package Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor // Constructor mặc định
@AllArgsConstructor // Constructor có tham số
@Entity
@Builder
@Table(name = "khach_hang")
public class KhachHang {
@Id
@Column(name = "id")
private String id;
    @ManyToOne
     @JoinColumn(name = "tai_khoan_id")
     private TaiKhoan taiKhoan;

    @Column(name = "ho_ten")
    private String hoTen;
    @Column(name = "so_dien_thoai")
    private String soDienThoai;
    @Column(name = "tinh")
    private String tinh; // Tỉnh thành

    @Column(name = "huyen")
    private String huyen; // Quận huyện

    @Column(name = "xa")
    private String xa; // Phường xã

    @Column(name = "dia_chi")
    private String diaChi; // Địa chỉ

}
