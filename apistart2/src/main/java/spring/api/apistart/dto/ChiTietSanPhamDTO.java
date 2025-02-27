package spring.api.apistart.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietSanPhamDTO {
    private Integer id;
    private Integer sanPhamId;
    private Integer soLuong;
    private String serial;
    private String viXuLy;
    private String ram;
    private String luuTru;
    private String cardDoHoa;
    private String manHinh;
    private String doPhanGiai;
    private String pin;
    private Double trongLuong;
    private String heDieuHanh;
}
