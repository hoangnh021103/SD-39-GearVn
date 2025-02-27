package spring.api.apistart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.api.apistart.entity.DonViVanChuyen;

import java.util.List;

public interface DonViVanChuyenrepository extends JpaRepository<DonViVanChuyen, Integer> {
    // Tìm đơn vị vận chuyển theo tên (không phân biệt hoa thường)
    List<DonViVanChuyen> findByTenIgnoreCase(String ten);

    // Tìm tất cả đơn vị vận chuyển có trạng thái hoạt động (true)
    List<DonViVanChuyen> findByTrangThaiTrue();

    // Tìm đơn vị vận chuyển theo số điện thoại
    DonViVanChuyen findBySoDienThoai(String soDienThoai);
}
