package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.TaiKhoan;
import spring.api.apistart.repository.TaiKhoanRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaiKhoanService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    public List<TaiKhoan> getAll() {
        return taiKhoanRepository.findAll();
    }

    public TaiKhoan getById(Integer id) {
        return taiKhoanRepository.findById(id).orElse(null);
    }

    public TaiKhoan add(TaiKhoan taiKhoan) {
        taiKhoan.setNgayTao(LocalDateTime.now());
        taiKhoan.setNgaySua(LocalDateTime.now());
        return taiKhoanRepository.save(taiKhoan);
    }

    public TaiKhoan update(Integer id, TaiKhoan taiKhoan) {
        return taiKhoanRepository.findById(id)
                .map(existing -> {
                    existing.setVaiTro(taiKhoan.getVaiTro());
                    existing.setMoTa(taiKhoan.getMoTa());
                    existing.setTrangThai(taiKhoan.getTrangThai());
                    existing.setNguoiSua(taiKhoan.getNguoiSua());
                    existing.setNgaySua(LocalDateTime.now());
                    return taiKhoanRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        taiKhoanRepository.deleteById(id);
    }
}