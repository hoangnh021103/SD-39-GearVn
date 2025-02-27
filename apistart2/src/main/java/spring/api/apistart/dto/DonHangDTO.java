package spring.api.apistart.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonHangDTO {
    private Integer id;
    private Integer khachHangId;
    private Integer nhanVienId;
    private Integer phuongThucTtId;
    private Integer donViVcId;
    private Integer maGiamGiaId;
    private String diaChiGiaoHang;
    private Byte trangThai;
    private LocalDateTime ngayTao;
    private LocalDateTime ngayCapNhat;
}
