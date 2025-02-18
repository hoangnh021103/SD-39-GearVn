package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.DonHangChiTiet;
import spring.api.apistart.repository.DonHangChiTietRepository;
import spring.api.apistart.repository.DonHangRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DonHangChiTietService {

    @Autowired
    private DonHangChiTietRepository donHangChiTietRepository;

    // Lấy tất cả don hang chi tiet
    public List<DonHangChiTiet> getAllDHCT() {
        return donHangChiTietRepository.findAll();
    }

    // Lấy DHCT theo id
    public Optional<DonHangChiTiet> getDHCTById(Integer id) {
        return donHangChiTietRepository.findById(id);
    }

    // Thêm DHCT mới
    public DonHangChiTiet createDHCT(DonHangChiTiet donHangChiTiet) {
        return donHangChiTietRepository.save(donHangChiTiet);
    }

    // Cập nhật thông tin DHCT
    public DonHangChiTiet updateDHCT(Integer id, DonHangChiTiet donHangChiTiet) {
        donHangChiTiet.setId(String.valueOf(id));
        return donHangChiTietRepository.save(donHangChiTiet);
    }

    // Xóa DHCT
    public void deleteDHCT(Integer id) {
        donHangChiTietRepository.deleteById(id);
    }
}
