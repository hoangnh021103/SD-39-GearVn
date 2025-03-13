package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.SanPham;
import spring.api.apistart.repository.SanPhamRepository;

import java.util.List;

@Service
public class SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    // Lấy tất cả không phân trang
    public List<SanPham> getAll() {
        return sanPhamRepository.findAll();
    }

    // Lấy tất cả có phân trang
    public Page<SanPham> getAll(Pageable pageable) {
        return sanPhamRepository.findAll(pageable);
    }

    // Tìm kiếm theo tên hoặc thương hiệu, có phân trang
    public Page<SanPham> search(String keyword, Pageable pageable) {
        return sanPhamRepository.findByTenContainingOrThuongHieu_TenContaining(keyword, keyword, pageable);
    }

    public SanPham getById(Integer id) {
        return sanPhamRepository.findById(id).orElse(null);
    }

    public SanPham add(SanPham sanPham) {
        return sanPhamRepository.save(sanPham);
    }

    public SanPham update(Integer id, SanPham sanPham) {
        return sanPhamRepository.findById(id)
                .map(existing -> {
                    existing.setThuongHieu(sanPham.getThuongHieu());
                    existing.setTen(sanPham.getTen());
                    existing.setBaoHanh(sanPham.getBaoHanh());
                    existing.setGiaNhap(sanPham.getGiaNhap());
                    existing.setGiaBan(sanPham.getGiaBan());
                    existing.setThue(sanPham.getThue());
                    existing.setMoTa(sanPham.getMoTa());
                    existing.setTrangThai(sanPham.getTrangThai());
                    return sanPhamRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        sanPhamRepository.deleteById(id);
    }
}