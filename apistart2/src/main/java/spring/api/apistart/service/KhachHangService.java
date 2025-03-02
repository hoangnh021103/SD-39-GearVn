package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.KhachHang;
import spring.api.apistart.repository.KhachHangRepository;

import java.util.List;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;

    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }

    public KhachHang getById(Integer id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    public KhachHang add(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    public KhachHang update(Integer id, KhachHang khachHang) {
        return khachHangRepository.findById(id)
                .map(existing -> {
                    existing.setHo(khachHang.getHo());
                    existing.setTen(khachHang.getTen());
                    existing.setEmail(khachHang.getEmail());
                    existing.setSdt(khachHang.getSdt());
                    existing.setNgaySinh(khachHang.getNgaySinh());
                    existing.setGioiTinh(khachHang.getGioiTinh());
                    existing.setTinh(khachHang.getTinh());
                    existing.setHuyen(khachHang.getHuyen());
                    existing.setXa(khachHang.getXa());
                    existing.setDiaChiChinh(khachHang.getDiaChiChinh());
                    existing.setDiaChiPhu(khachHang.getDiaChiPhu());
                    existing.setMatKhau(khachHang.getMatKhau());
                    existing.setTrangThai(khachHang.getTrangThai());
                    return khachHangRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        khachHangRepository.deleteById(id);
    }
}