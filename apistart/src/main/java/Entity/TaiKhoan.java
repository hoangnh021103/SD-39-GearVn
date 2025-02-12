package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tai_khoan")
    public class TaiKhoan {
        @Id
        @Column(name = "id")
        private Integer id;

        @Column(name = "email")
        private String email;

        @Column(name = "mat_khau_hash")
        private String matKhauHash;

        @Column(name = "vai_tro")
        private String vaiTro;

        @Column(name = "token_lam_moi")
        private String tokenLamMoi;

        @Column(name = "trang_thai")
        private Boolean trangThai;

    }
