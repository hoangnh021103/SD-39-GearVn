package spring.api.apistart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhachHangDTO {
    private Integer id;
    private Integer taiKhoanId;
    private String hoTen;
    private String soDienThoai;
    private String sdtPhu;
    private String tinh;
    private String huyen;
    private String xa;
    private String diaChi;
    private String diaChiPhu;
}
