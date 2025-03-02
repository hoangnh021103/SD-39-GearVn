package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
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