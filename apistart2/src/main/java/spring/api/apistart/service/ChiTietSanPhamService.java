package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.dto.ChiTietSanPhamCustom;
import spring.api.apistart.entity.ChiTietSanPham;
import spring.api.apistart.repository.ChiTietSanPhamrepo;

import java.util.List;
import java.util.Optional;

@Service
public class ChiTietSanPhamService {

    @Autowired
    private ChiTietSanPhamrepo chiTietSanPhamrepo;

    // Lấy tất cả chi tiết sản phẩm
    public List<ChiTietSanPhamCustom> getAll() {
        return chiTietSanPhamrepo.getAllCTSP();
    }

    // Thêm chi tiết sản phẩm mới
    public ChiTietSanPham add(ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamrepo.save(chiTietSanPham);
    }

    // Xóa chi tiết sản phẩm
    public void deleteCTSP(Integer id) {
        chiTietSanPhamrepo.deleteById(id);
    }
}
