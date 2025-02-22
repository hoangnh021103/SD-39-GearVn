package spring.api.apistart.dto;

import java.util.Date;

public interface NhanVienCustom {
    Integer getId();
    Integer getTaiKhoanId(); // Chỉ lấy ID của tài khoản
    String getHoTen();
    Date getNgaySinh();
    String getGioiTinh();
    String getSoDienThoai();
    String getDiaChi();
}
