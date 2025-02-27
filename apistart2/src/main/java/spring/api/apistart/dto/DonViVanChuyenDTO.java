package spring.api.apistart.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonViVanChuyenDTO {
    private Integer id;
    private String ten;
    private String soDienThoai;
    private String email;
    private Boolean trangThai;
}
