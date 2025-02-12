package service;
import Entity.NhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.NhanVienRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    // Lấy tất cả nhân viên
    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.findAll();
    }

    // Lấy nhân viên theo id
    public Optional<NhanVien> getNhanVienById(String id) {
        return nhanVienRepository.findById(id);
    }

    // Thêm nhân viên mới
    public NhanVien createNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    // Cập nhật thông tin nhân viên
    public NhanVien updateNhanVien(String id, NhanVien nhanVien) {
        nhanVien.setId(id);
        return nhanVienRepository.save(nhanVien);
    }

    // Xóa nhân viên
    public void deleteNhanVien(String id) {
        nhanVienRepository.deleteById(id);
    }
}

