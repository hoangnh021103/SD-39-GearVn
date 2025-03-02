package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "san_pham")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "thuong_hieu_id")
    private ThuongHieu thuongHieu;

    @Column(name = "ten", nullable = false, length = 50)
    private String ten;

    @Column(name = "bao_hanh", length = 50)
    private String baoHanh;

    @Column(name = "gia_nhap", nullable = false, precision = 10)
    private Double giaNhap;

    @Column(name = "gia_ban", nullable = false, precision = 10)
    private Double giaBan;

    @Column(name = "thue", nullable = false, precision = 10)
    private Double thue;

    @Column(name = "mo_ta", length = 255)
    private String moTa;

    @Column(name = "trang_thai", nullable = false)
    private Byte trangThai = 0;
}