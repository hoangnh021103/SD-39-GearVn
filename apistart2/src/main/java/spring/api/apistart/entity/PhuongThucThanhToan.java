package spring.api.apistart.entity;


import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "phuong_thuc_thanh_toan")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhuongThucThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten", nullable = false, unique = true, length = 50)
    private String ten;
}
