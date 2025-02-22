package spring.api.apistart.dto;

public interface SanPhamCustom {
    Integer getId();
    String getTen();
    String getHinhDaiDien();
    Integer getBaoHanh();
    Integer getGiaNhap();
    Integer getGiaBan();
    Double getThue();
    String getMoTa();

    DanhMucCustom getDanhMuc();
    MauSacCustom getMauSac();
    HinhAnhCustom getHinhAnh();
    ThuongHieuCustom getThuongHieu();
}
