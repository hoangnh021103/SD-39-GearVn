package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.NhanVien;
import spring.api.apistart.repository.NhanVienRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;

    public List<NhanVien> getAll() {
        return nhanVienRepository.findAll();
    }

    public NhanVien getById(Integer id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

    public NhanVien add(NhanVien nhanVien) {
        nhanVien.setNgayBatDau(LocalDateTime.now());
        return nhanVienRepository.save(nhanVien);
    }

    public NhanVien update(Integer id, NhanVien nhanVien) {
        return nhanVienRepository.findById(id)
                .map(existing -> {
                    existing.setTaiKhoan(nhanVien.getTaiKhoan());
                    existing.setHo(nhanVien.getHo());
                    existing.setTen(nhanVien.getTen());
                    existing.setEmail(nhanVien.getEmail());
                    existing.setMatKhau(nhanVien.getMatKhau());
                    existing.setSdt(nhanVien.getSdt());
                    existing.setNgaySinh(nhanVien.getNgaySinh());
                    existing.setGioiTinh(nhanVien.getGioiTinh());
                    existing.setTrangThai(nhanVien.getTrangThai());
                    existing.setNgayKetThuc(nhanVien.getNgayKetThuc());
                    return nhanVienRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        nhanVienRepository.deleteById(id);
    }
}