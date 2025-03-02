package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.SanPham;
import spring.api.apistart.repository.SanPhamRepository;

import java.util.List;

@Service
public class SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    public List<SanPham> getAll() {
        return sanPhamRepository.findAll();
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