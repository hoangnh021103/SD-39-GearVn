package spring.api.apistart.service;

import spring.api.apistart.entity.MaGiamGia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.repository.MaGiamGiaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MaGiamGiaService {
    @Autowired
    private MaGiamGiaRepository maGiamGiaRepository;

    // Lấy tất cả ma
    public List<MaGiamGia> getAllMaGG() {
        return maGiamGiaRepository.findAll();
    }

    // Lấy ma theo id
    public Optional<MaGiamGia> getMaGGById(Integer id) {
        return maGiamGiaRepository.findById(id);
    }

    // Thêm ma mới
    public MaGiamGia createMaGG(MaGiamGia maGiamGia) {
        return maGiamGiaRepository.save(maGiamGia);
    }

    // Cập nhật thông tin ma
    public MaGiamGia updateMaGG(Integer id, MaGiamGia maGiamGia) {
        maGiamGia.setId(String.valueOf(id));
        return maGiamGiaRepository.save(maGiamGia);
    }

    // Xóa ma
    public void deleteMaGG(Integer id) {
        maGiamGiaRepository.deleteById(id);
    }

}

