package spring.api.apistart.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.KhachHang;
import spring.api.apistart.repository.KhachHangrepository;

import java.util.List;

@Service
public class KhachHangService {

    @Autowired
    private KhachHangrepository khachHangRepository;

    // Create
    public KhachHang createKhachHang(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    // Read All
    public List<KhachHang> getAllKhachHang() {
        return khachHangRepository.findAll();
    }

    // Read By ID
    public KhachHang getKhachHangById(Integer id) {
        return khachHangRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy khách hàng"));
    }

    // Update
    public KhachHang updateKhachHang(Integer id, KhachHang khachHang) {
        KhachHang khachHangUpdate = getKhachHangById(id);
        khachHangUpdate.setTaiKhoan(khachHang.getTaiKhoan());
        khachHangUpdate.setHoTen(khachHang.getHoTen());
        khachHangUpdate.setSoDienThoai(khachHang.getSoDienThoai());
        khachHangUpdate.setSdtPhu(khachHang.getSdtPhu());
        khachHangUpdate.setTinh(khachHang.getTinh());
        khachHangUpdate.setHuyen(khachHang.getHuyen());
        khachHangUpdate.setXa(khachHang.getXa());
        khachHangUpdate.setDiaChi(khachHang.getDiaChi());
        khachHangUpdate.setDiaChiPhu(khachHang.getDiaChiPhu());
        return khachHangRepository.save(khachHangUpdate);
    }

    // Delete
    public void deleteKhachHang(Integer id) {
        KhachHang khachHang = getKhachHangById(id);
        khachHangRepository.delete(khachHang);
    }
}
