package spring.api.apistart.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.ChiTietDonHang;
import spring.api.apistart.repository.ChiTietDonHangrepository;

import java.util.List;

@Service
public class ChiTietDonHangService {

    @Autowired
    private ChiTietDonHangrepository chiTietDonHangRepository;

    // Create
    public ChiTietDonHang createChiTietDonHang(ChiTietDonHang chiTietDonHang) {
        return chiTietDonHangRepository.save(chiTietDonHang);
    }

    // Read All
    public List<ChiTietDonHang> getAllChiTietDonHang() {
        return chiTietDonHangRepository.findAll();
    }

    // Read By ID
    public ChiTietDonHang getChiTietDonHangById(Integer id) {
        return chiTietDonHangRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy chi tiết đơn hàng"));
    }

    // Update
    public ChiTietDonHang updateChiTietDonHang(Integer id, ChiTietDonHang chiTietDonHang) {
        ChiTietDonHang chiTietDonHangUpdate = getChiTietDonHangById(id);
        chiTietDonHangUpdate.setDonHang(chiTietDonHang.getDonHang());
        chiTietDonHangUpdate.setSanPham(chiTietDonHang.getSanPham());
        chiTietDonHangUpdate.setSoLuong(chiTietDonHang.getSoLuong());
        chiTietDonHangUpdate.setGia(chiTietDonHang.getGia());
        chiTietDonHangUpdate.setThue(chiTietDonHang.getThue());
        chiTietDonHangUpdate.setThanhTien(chiTietDonHang.getThanhTien());
        return chiTietDonHangRepository.save(chiTietDonHangUpdate);
    }

    // Delete
    public void deleteChiTietDonHang(Integer id) {
        ChiTietDonHang chiTietDonHang = getChiTietDonHangById(id);
        chiTietDonHangRepository.delete(chiTietDonHang);
    }
}
