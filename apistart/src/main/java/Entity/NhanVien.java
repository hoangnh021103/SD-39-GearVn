package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "nhan_vien")
public class NhanVien {

    @Id
    @Column(name = "id")
    private String id; // Khóa chính, kiểu NVARCHAR(20)

    @ManyToOne
    @JoinColumn(name = "tai_khoan_id")
    private TaiKhoan taiKhoan; // Liên kết với bảng TaiKhoan

    @Column(name = "ho_ten")
    private String hoTen; // Họ và tên của nhân viên

    @Column(name = "ngay_sinh")
    private Date ngaySinh; // Ngày sinh của nhân viên

    @Column(name = "gioi_tinh")
    private String gioiTinh; // Giới tính của nhân viên

    @Column(name = "cmnd_cccd")
    private String cmndCccd; // CMND/CCCD của nhân viên

    @Column(name = "so_dien_thoai")
    private String soDienThoai; // Số điện thoại của nhân viên

    @Column(name = "dia_chi")
    private String diaChi; // Địa chỉ của nhân viên

}

