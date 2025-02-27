package spring.api.apistart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaiKhoanDTO {
    private Integer id;
    private String email;
    private String vaiTro;
    private Boolean trangThai;
}
