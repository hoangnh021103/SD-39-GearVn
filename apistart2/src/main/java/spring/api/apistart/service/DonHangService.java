package spring.api.apistart.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.DonHang;
import spring.api.apistart.repository.DonHangrepository;

import java.util.List;

@Service
public class DonHangService {

    @Autowired
    private DonHangrepository donHangRepository;

    // Create
    public DonHang createDonHang(DonHang donHang) {
        return donHangRepository.save(donHang);
    }

    // Read All
    public List<DonHang> getAllDonHang() {
        return donHangRepository.findAll();
    }

    // Read By ID
    public DonHang getDonHangById(Integer id) {
        return donHangRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy đơn hàng"));
    }

    // Update
    public DonHang updateDonHang(Integer id, DonHang donHang) {
        DonHang donHangUpdate = getDonHangById(id);
        donHangUpdate.setKhachHang(donHang.getKhachHang());
        donHangUpdate.setNhanVien(donHang.getNhanVien());
        donHangUpdate.setPhuongThucThanhToan(donHang.getPhuongThucThanhToan());
        donHangUpdate.setDonViVanChuyen(donHang.getDonViVanChuyen());
        donHangUpdate.setMaGiamGia(donHang.getMaGiamGia());
        donHangUpdate.setDiaChiGiaoHang(donHang.getDiaChiGiaoHang());
        donHangUpdate.setTrangThai(donHang.getTrangThai());
        donHangUpdate.setNgayTao(donHang.getNgayTao());
        donHangUpdate.setNgayCapNhat(donHang.getNgayCapNhat());
        return donHangRepository.save(donHangUpdate);
    }

    // Delete
    public void deleteDonHang(Integer id) {
        DonHang donHang = getDonHangById(id);
        donHangRepository.delete(donHang);
    }
}
