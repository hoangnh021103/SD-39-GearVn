package spring.api.apistart.entity;



import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "hinh_anh")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HinhAnh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(name = "hinh_json", nullable = false, length = 1000)
    private String hinhJson;
}
