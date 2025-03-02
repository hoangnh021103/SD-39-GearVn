package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.PhuongThucThanhToan;
import spring.api.apistart.repository.PhuongThucThanhToanRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PhuongThucThanhToanService {
    @Autowired
    private PhuongThucThanhToanRepository phuongThucThanhToanRepository;

    public List<PhuongThucThanhToan> getAll() {
        return phuongThucThanhToanRepository.findAll();
    }

    public PhuongThucThanhToan getById(Integer id) {
        return phuongThucThanhToanRepository.findById(id).orElse(null);
    }

    public PhuongThucThanhToan add(PhuongThucThanhToan phuongThucThanhToan) {
        phuongThucThanhToan.setNgayTao(LocalDateTime.now());
        phuongThucThanhToan.setNgaySua(LocalDateTime.now());
        return phuongThucThanhToanRepository.save(phuongThucThanhToan);
    }

    public PhuongThucThanhToan update(Integer id, PhuongThucThanhToan phuongThucThanhToan) {
        return phuongThucThanhToanRepository.findById(id)
                .map(existing -> {
                    existing.setTen(phuongThucThanhToan.getTen());
                    existing.setTrangThai(phuongThucThanhToan.getTrangThai());
                    existing.setMoTa(phuongThucThanhToan.getMoTa());
                    existing.setNguoiSua(phuongThucThanhToan.getNguoiSua());
                    existing.setNgaySua(LocalDateTime.now());
                    return phuongThucThanhToanRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        phuongThucThanhToanRepository.deleteById(id);
    }
}