package spring.api.apistart.dto;

public interface KhachHangCustom {
    Integer getId();
    Integer getTaiKhoanId(); // Chỉ lấy ID của tài khoản
    String getHoTen();
    String getSoDienThoai();
    String getSdtPhu();
    String getTinh();
    String getHuyen();
    String getXa();
    String getDiaChi();
    String getDiaChiPhu();
}
