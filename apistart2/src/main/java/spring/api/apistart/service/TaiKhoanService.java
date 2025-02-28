package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.TaiKhoan;
import spring.api.apistart.repository.TaiKhoanrepository;

import java.util.List;

@Service
public class TaiKhoanService {

    @Autowired
    private TaiKhoanrepository taiKhoanRepository;

    // Create
    public TaiKhoan createTaiKhoan(TaiKhoan taiKhoan) {
        return taiKhoanRepository.save(taiKhoan);
    }

    // Read All
    public List<TaiKhoan> getAllTaiKhoan() {
        return taiKhoanRepository.findAll();
    }

    // Read By ID
    public TaiKhoan getTaiKhoanById(Integer id) {
        return taiKhoanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy tài khoản"));
    }

    // Update
    public TaiKhoan updateTaiKhoan(Integer id, TaiKhoan taiKhoan) {
        TaiKhoan taiKhoanUpdate = getTaiKhoanById(id);
        taiKhoanUpdate.setEmail(taiKhoan.getEmail());
        taiKhoanUpdate.setMatKhauHash(taiKhoan.getMatKhauHash());
        taiKhoanUpdate.setVaiTro(taiKhoan.getVaiTro());
        taiKhoanUpdate.setTrangThai(taiKhoan.getTrangThai());
        return taiKhoanRepository.save(taiKhoanUpdate);
    }

    // Delete
    public void deleteTaiKhoan(Integer id) {
        TaiKhoan taiKhoan = getTaiKhoanById(id);
        taiKhoanRepository.delete(taiKhoan);
    }
}