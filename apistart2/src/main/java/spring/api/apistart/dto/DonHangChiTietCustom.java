package spring.api.apistart.dto;

public interface DonHangChiTietCustom {
    String getId();

    Integer getSoLuong();
    Integer getGia();
    Float getThue();
    Integer getThanhTien();

    SanPhamCustom getSanPham();
    DonHangCustom getDonHang();
}
