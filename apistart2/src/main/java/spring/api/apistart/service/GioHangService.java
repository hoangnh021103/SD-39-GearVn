package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.GioHang;
import spring.api.apistart.repository.GioHangRepository;

import java.util.List;

@Service
public class GioHangService {
    @Autowired
    private GioHangRepository gioHangRepository;

    public List<GioHang> getAll() {
        return gioHangRepository.findAll();
    }

    public Page<GioHang> getAll(Pageable pageable) {
        return gioHangRepository.findAll(pageable);
    }

    public Page<GioHang> search(String keyword, Pageable pageable) {
        return gioHangRepository.findByKhachHang_EmailContaining(keyword, pageable);
    }

    public GioHang getById(Integer id) {
        return gioHangRepository.findById(id).orElse(null);
    }

    public GioHang add(GioHang gioHang) {
        return gioHangRepository.save(gioHang);
    }

    public GioHang update(Integer id, GioHang gioHang) {
        return gioHangRepository.findById(id)
                .map(existing -> {
                    existing.setKhachHang(gioHang.getKhachHang());
                    existing.setTen(gioHang.getTen());
                    return gioHangRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        gioHangRepository.deleteById(id);
    }
}