package service;

import Entity.TaiKhoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TaiKhoanrepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaiKhoanService {

    @Autowired
    private TaiKhoanrepository taiKhoanRepository;

    // Lấy tất cả tài khoản
    public List<TaiKhoan> getAllTaiKhoan() {
        return taiKhoanRepository.findAll();
    }

    // Lấy tài khoản theo id
    public Optional<TaiKhoan> getTaiKhoanById(Integer id) {
        return taiKhoanRepository.findById(id);
    }

    // Thêm tài khoản mới
    public TaiKhoan createTaiKhoan(TaiKhoan taiKhoan) {
        return taiKhoanRepository.save(taiKhoan);
    }

    // Cập nhật tài khoản
    public TaiKhoan updateTaiKhoan(Integer id, TaiKhoan taiKhoan) {
        taiKhoan.setId(id);
        return taiKhoanRepository.save(taiKhoan);
    }

    // Xóa tài khoản
    public void deleteTaiKhoan(Integer id) {
        taiKhoanRepository.deleteById(id);
    }
}
