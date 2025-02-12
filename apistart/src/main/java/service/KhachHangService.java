package service;

import Entity.KhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.KhachHangRepository;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    // Lấy tất cả khách hàng
    public List<KhachHang> getAllKhachHang() {
        return khachHangRepository.findAll();
    }

    // Lấy khách hàng theo id
    public Optional<KhachHang> getKhachHangById(String id) {
        return khachHangRepository.findById(id);
    }

    // Thêm khách hàng mới
    public KhachHang createKhachHang(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    // Cập nhật thông tin khách hàng
    public KhachHang updateKhachHang(String id, KhachHang khachHang) {
        khachHang.setId(id);
        return khachHangRepository.save(khachHang);
    }

    // Xóa khách hàng
    public void deleteKhachHang(String id) {
        khachHangRepository.deleteById(id);
    }
}
