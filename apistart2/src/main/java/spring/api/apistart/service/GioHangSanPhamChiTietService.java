package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.GioHangSpct;
import spring.api.apistart.repository.GioHangSpctRepository;

import java.util.List;

@Service
public class GioHangSanPhamChiTietService {
    @Autowired
    private GioHangSpctRepository gioHangSpctRepository;

    public List<GioHangSpct> getAll() {
        return gioHangSpctRepository.findAll();
    }

    public Page<GioHangSpct> getAll(Pageable pageable) {
        return gioHangSpctRepository.findAll(pageable);
    }

    public Page<GioHangSpct> search(String keyword, Pageable pageable) {
        return gioHangSpctRepository.findByChiTietSanPham_SanPham_TenContaining(keyword, pageable);
    }

    public GioHangSpct getById(Integer id) {
        return gioHangSpctRepository.findById(id).orElse(null);
    }

    public GioHangSpct add(GioHangSpct gioHangSpct) {
        return gioHangSpctRepository.save(gioHangSpct);
    }

    public GioHangSpct update(Integer id, GioHangSpct gioHangSpct) {
        return gioHangSpctRepository.findById(id)
                .map(existing -> {
                    existing.setGioHang(gioHangSpct.getGioHang());
                    existing.setChiTietSanPham(gioHangSpct.getChiTietSanPham());
                    existing.setSoLuong(gioHangSpct.getSoLuong());
                    existing.setTrangThai(gioHangSpct.getTrangThai());
                    return gioHangSpctRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        gioHangSpctRepository.deleteById(id);
    }
}