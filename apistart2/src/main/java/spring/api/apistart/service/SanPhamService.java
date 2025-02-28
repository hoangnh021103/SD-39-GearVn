package spring.api.apistart.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.SanPham;
import spring.api.apistart.repository.SanPhamrepository;

import java.util.List;

@Service
public class SanPhamService {

    @Autowired
    private SanPhamrepository sanPhamRepository;

    // Create
    public SanPham createSanPham(SanPham sanPham) {
        return sanPhamRepository.save(sanPham);
    }

    // Read All
    public List<SanPham> getAllSanPham() {
        return sanPhamRepository.findAll();
    }

    // Read By ID
    public SanPham getSanPhamById(Integer id) {
        return sanPhamRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy sản phẩm"));
    }

    // Update
    public SanPham updateSanPham(Integer id, SanPham sanPham) {
        SanPham sanPhamUpdate = getSanPhamById(id);
        sanPhamUpdate.setDanhMuc(sanPham.getDanhMuc());
        sanPhamUpdate.setThuongHieu(sanPham.getThuongHieu());
        sanPhamUpdate.setMauSac(sanPham.getMauSac());
        sanPhamUpdate.setHinhAnh(sanPham.getHinhAnh());
        sanPhamUpdate.setTen(sanPham.getTen());
        sanPhamUpdate.setHinhDaiDien(sanPham.getHinhDaiDien());
        sanPhamUpdate.setBaoHanh(sanPham.getBaoHanh());
        sanPhamUpdate.setGiaNhap(sanPham.getGiaNhap());
        sanPhamUpdate.setGiaBan(sanPham.getGiaBan());
        sanPhamUpdate.setThue(sanPham.getThue());
        sanPhamUpdate.setMoTa(sanPham.getMoTa());
        return sanPhamRepository.save(sanPhamUpdate);
    }

    // Delete
    public void deleteSanPham(Integer id) {
        SanPham sanPham = getSanPhamById(id);
        sanPhamRepository.delete(sanPham);
    }
}
