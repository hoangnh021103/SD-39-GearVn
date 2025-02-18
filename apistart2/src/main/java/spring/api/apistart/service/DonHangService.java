package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.DonHang;
import spring.api.apistart.repository.DonHangRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DonHangService {
    @Autowired
    private DonHangRepository donHangRepository;

    // Lấy tất cả don hang
    public List<DonHang> getAllDH() {
        return donHangRepository.findAll();
    }

    // Lấy DH theo id
    public Optional<DonHang> getDHById(Integer id) {
        return donHangRepository.findById(id);
    }

    // Thêm DH mới
    public DonHang createDH(DonHang donHang) {
        return donHangRepository.save(donHang);
    }

    // Cập nhật thông tin DH
    public DonHang updateDH(Integer id, DonHang donHang) {
        donHang.setId(String.valueOf(id));
        return donHangRepository.save(donHang);
    }

    // Xóa DH
    public void deleteDH(Integer id) {
        donHangRepository.deleteById(id);
    }
}

