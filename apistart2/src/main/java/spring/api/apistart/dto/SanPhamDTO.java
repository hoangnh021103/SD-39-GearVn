package spring.api.apistart.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SanPhamDTO {
    private Integer id;
    private Byte danhMucId;
    private Byte thuongHieuId;
    private Byte mauSacId;
    private Byte hinhAnhId;
    private String ten;
    private String hinhDaiDien;
    private Integer baoHanh;
    private Integer giaNhap;
    private Integer giaBan;
    private Float thue;
    private String moTa;
}
