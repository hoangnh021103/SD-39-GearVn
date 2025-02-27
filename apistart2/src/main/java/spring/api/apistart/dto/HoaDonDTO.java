package spring.api.apistart.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonDTO {
    private Integer id;
    private Integer donHangId;
    private Integer khachHangId;
    private Integer tongTien;
    private String ghiChu;
    private LocalDateTime ngayXuat;
}
