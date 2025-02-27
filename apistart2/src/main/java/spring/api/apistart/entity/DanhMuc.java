package spring.api.apistart.entity;



import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "danh_muc")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @Column(name = "ten_json", nullable = false, length = 50)
    private String tenJson;
}
