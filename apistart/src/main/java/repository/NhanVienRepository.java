package repository;

import Entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    // Các phương thức truy vấn tùy chỉnh (nếu có) có thể được định nghĩa ở đây
}
