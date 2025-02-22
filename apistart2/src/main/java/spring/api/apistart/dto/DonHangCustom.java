package spring.api.apistart.dto;

public interface DonHangCustom {
    String getId();

    String getDiaChiGiaoHang();
    Integer getTrangThai();
    String getNgayTao();
    String getNgayCapNhat();

    KhachHangCustom getKhachHang();
    NhanVienCustom getNhanVien();
    MaGiamGiaCustom getMaGiamGia();
}
