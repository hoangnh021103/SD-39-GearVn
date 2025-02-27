package spring.api.apistart.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaGiamGiaDTO {
    private Integer id;
    private String tenGiamGia;
    private Boolean loaiGiamGia;
    private Float giaTriGiam;
    private Integer donHangToiThieu;
    private Integer giamGiaToiDa;
    private Integer gioiHanSuDung;
    private String moTa;
    private LocalDateTime ngayBatDau;
    private LocalDateTime ngayKetThuc;
}
