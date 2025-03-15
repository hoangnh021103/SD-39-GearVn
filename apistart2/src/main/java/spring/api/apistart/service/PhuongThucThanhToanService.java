package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.PhuongThucThanhToan;
import spring.api.apistart.repository.PhuongThucThanhToanRepository;

import java.util.List;

@Service
public class PhuongThucThanhToanService {
    @Autowired
    private PhuongThucThanhToanRepository phuongThucThanhToanRepository;

    public List<PhuongThucThanhToan> getAll() {
        return phuongThucThanhToanRepository.findAll();
    }

    public Page<PhuongThucThanhToan> getAll(Pageable pageable) {
        return phuongThucThanhToanRepository.findAll(pageable);
    }

    public PhuongThucThanhToan getById(Integer id) {
        return phuongThucThanhToanRepository.findById(id).orElse(null);
    }

    public PhuongThucThanhToan add(PhuongThucThanhToan pttt) {
        return phuongThucThanhToanRepository.save(pttt);
    }

    public PhuongThucThanhToan update(Integer id, PhuongThucThanhToan pttt) {
        return phuongThucThanhToanRepository.findById(id)
                .map(existing -> {
                    existing.setTen(pttt.getTen());
                    existing.setTrangThai(pttt.getTrangThai());
                    return phuongThucThanhToanRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        phuongThucThanhToanRepository.deleteById(id);
    }
}