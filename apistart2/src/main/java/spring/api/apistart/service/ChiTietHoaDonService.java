package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.ChiTietHoaDon;
import spring.api.apistart.repository.ChiTietHoaDonRepository;

import java.util.List;

@Service
public class ChiTietHoaDonService {
    @Autowired
    private ChiTietHoaDonRepository chiTietHoaDonRepository;

    public List<ChiTietHoaDon> getAll() {
        return chiTietHoaDonRepository.findAll();
    }

    public Page<ChiTietHoaDon> getAll(Pageable pageable) {
        return chiTietHoaDonRepository.findAll(pageable);
    }

    public Page<ChiTietHoaDon> search(String keyword, Pageable pageable) {
        return chiTietHoaDonRepository.findByHoaDon_MaDonHangContainingOrSanPham_TenContaining(keyword, keyword, pageable);
    }

    public ChiTietHoaDon getById(Integer id) {
        return chiTietHoaDonRepository.findById(id).orElse(null);
    }

    public ChiTietHoaDon add(ChiTietHoaDon chiTietHoaDon) {
        return chiTietHoaDonRepository.save(chiTietHoaDon);
    }

    public ChiTietHoaDon update(Integer id, ChiTietHoaDon chiTietHoaDon) {
        return chiTietHoaDonRepository.findById(id)
                .map(existing -> {
                    existing.setHoaDon(chiTietHoaDon.getHoaDon());
                    existing.setSanPham(chiTietHoaDon.getSanPham());
                    existing.setSoLuong(chiTietHoaDon.getSoLuong());
                    existing.setGiaBan(chiTietHoaDon.getGiaBan());
                    existing.setThue(chiTietHoaDon.getThue());
                    existing.setThanhTien(chiTietHoaDon.getThanhTien());
                    return chiTietHoaDonRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        chiTietHoaDonRepository.deleteById(id);
    }
}