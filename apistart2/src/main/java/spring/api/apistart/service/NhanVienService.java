package spring.api.apistart.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.NhanVien;
import spring.api.apistart.repository.NhanVienrepository;

import java.util.List;

@Service
public class NhanVienService {

    @Autowired
    private NhanVienrepository nhanVienRepository;

    // Create
    public NhanVien createNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    // Read All
    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.findAll();
    }

    // Read By ID
    public NhanVien getNhanVienById(Integer id) {
        return nhanVienRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy nhân viên"));
    }

    // Update
    public NhanVien updateNhanVien(Integer id, NhanVien nhanVien) {
        NhanVien nhanVienUpdate = getNhanVienById(id);
        nhanVienUpdate.setTaiKhoan(nhanVien.getTaiKhoan());
        nhanVienUpdate.setHoTen(nhanVien.getHoTen());
        nhanVienUpdate.setNgaySinh(nhanVien.getNgaySinh());
        nhanVienUpdate.setGioiTinh(nhanVien.getGioiTinh());
        nhanVienUpdate.setSoDienThoai(nhanVien.getSoDienThoai());
        nhanVienUpdate.setDiaChi(nhanVien.getDiaChi());
        return nhanVienRepository.save(nhanVienUpdate);
    }

    // Delete
    public void deleteNhanVien(Integer id) {
        NhanVien nhanVien = getNhanVienById(id);
        nhanVienRepository.delete(nhanVien);
    }
}
