package spring.api.apistart.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GioHangDTO {
    private Integer id;
    private Integer khachHangId;
    private Integer sanPhamId;
    private Integer soLuong;
    private Integer gia;
    private Float thue;
    private LocalDateTime ngayTao;
}
