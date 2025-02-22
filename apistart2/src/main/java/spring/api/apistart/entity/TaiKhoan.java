package spring.api.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tai_khoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, length = 50)
    private String email;

    @Column(name = "mat_khau_hash", length = 255)
    private String matKhauHash;

    @Column(name = "vai_tro", nullable = false, length = 40)
    private String vaiTro;

    @Column(name = "trang_thai", nullable = false)
    private Boolean trangThai = true;
}
