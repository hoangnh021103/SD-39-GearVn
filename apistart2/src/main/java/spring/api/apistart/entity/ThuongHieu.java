package spring.api.apistart.entity;



import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "thuong_hieu")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThuongHieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(name = "thuong_hieu_json", nullable = false, length = 100)
    private String thuongHieuJson;
}
