package repository;

import Entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
    // Các phương thức truy vấn tùy chỉnh (nếu có) có thể được định nghĩa ở đây
}

