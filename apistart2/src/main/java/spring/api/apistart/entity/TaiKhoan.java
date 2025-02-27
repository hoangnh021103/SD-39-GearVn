package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tai_khoan")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Column(name = "mat_khau_hash", length = 255)
    private String matKhauHash;

    @Column(name = "vai_tro", nullable = false, length = 40)
    private String vaiTro;

    @Column(name = "trang_thai", nullable = false)
    private Boolean trangThai = true;
}