package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Entity
@Table(name = "phuong_thuc_thanh_toan")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhuongThucThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten", nullable = false, length = 50)
    private String ten;

    @Column(name = "trang_thai", nullable = false)
    private Byte trangThai = 0; // 0: Hoạt động, 1: Khóa

    @Column(name = "mo_ta", length = 255)
    private String moTa;

    @Column(name = "nguoi_tao", nullable = false, length = 50)
    private String nguoiTao;

    @Column(name = "ngay_tao", nullable = false)
    private LocalDateTime ngayTao;

    @Column(name = "nguoi_sua", nullable = false, length = 50)
    private String nguoiSua;

    @Column(name = "ngay_sua", nullable = false)
    private LocalDateTime ngaySua;
}