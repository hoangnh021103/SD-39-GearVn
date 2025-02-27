package spring.api.apistart.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietDonHangDTO {
    private Integer id;
    private Integer donHangId;
    private Integer sanPhamId;
    private Integer soLuong;
    private Integer gia;
    private Float thue;
    private Integer thanhTien;
}
