package spring.api.apistart.dto;

import java.math.BigDecimal;

public interface ChiTietSanPhamCustom {
    Integer getId();
    String getSerial();
    String getViXuLy();
    String getRam();
    String getLuuTru();
    String getCardDoHoa();
    String getManHinh();
    String getDoPhanGiai();
    String getPin();
    BigDecimal getTrongLuong();
    String getHeDieuHanh();
    Integer getBaoHanh();

    SanPhamCustom getSanPham(); // Lấy thông tin sản phẩm chính
}
