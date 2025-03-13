package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.HoaDon;
import spring.api.apistart.repository.HoaDonRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HoaDonService {
    @Autowired
    private HoaDonRepository hoaDonRepository;

    public List<HoaDon> getAll() {
        return hoaDonRepository.findAll();
    }

    public Page<HoaDon> getAll(Pageable pageable) {
        return hoaDonRepository.findAll(pageable);
    }

    public Page<HoaDon> search(String keyword, Pageable pageable) {
        return hoaDonRepository.findByMaDonHangContainingOrKhachHang_EmailContaining(keyword, keyword, pageable);
    }

    public HoaDon getById(Integer id) {
        return hoaDonRepository.findById(id).orElse(null);
    }

    public HoaDon add(HoaDon hoaDon) {
        hoaDon.setNgayTao(LocalDateTime.now());
        hoaDon.setNgayCapNhat(LocalDateTime.now());
        return hoaDonRepository.save(hoaDon);
    }

    public HoaDon update(Integer id, HoaDon hoaDon) {
        return hoaDonRepository.findById(id)
                .map(existing -> {
                    existing.setKhachHang(hoaDon.getKhachHang());
                    existing.setNhanVien(hoaDon.getNhanVien());
                    existing.setPhuongThucThanhToan(hoaDon.getPhuongThucThanhToan());
                    existing.setDonViVanChuyen(hoaDon.getDonViVanChuyen());
                    existing.setDiaChiGiaoHang(hoaDon.getDiaChiGiaoHang());
                    existing.setTongTien(hoaDon.getTongTien());
                    existing.setTrangThai(hoaDon.getTrangThai());
                    existing.setGhiChu(hoaDon.getGhiChu());
                    existing.setNgayCapNhat(LocalDateTime.now());
                    existing.setMaDonHang(hoaDon.getMaDonHang());
                    return hoaDonRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        hoaDonRepository.deleteById(id);
    }
}