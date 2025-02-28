package spring.api.apistart.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.MaGiamGia;
import spring.api.apistart.repository.MaGiamGiarepository;

import java.util.List;

@Service
public class MaGiamGiaService {

    @Autowired
    private MaGiamGiarepository maGiamGiaRepository;

    // Create
    public MaGiamGia createMaGiamGia(MaGiamGia maGiamGia) {
        return maGiamGiaRepository.save(maGiamGia);
    }

    // Read All
    public List<MaGiamGia> getAllMaGiamGia() {
        return maGiamGiaRepository.findAll();
    }

    // Read By ID
    public MaGiamGia getMaGiamGiaById(Integer id) {
        return maGiamGiaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy mã giảm giá"));
    }

    // Update
    public MaGiamGia updateMaGiamGia(Integer id, MaGiamGia maGiamGia) {
        MaGiamGia maGiamGiaUpdate = getMaGiamGiaById(id);
        maGiamGiaUpdate.setTenGiamGia(maGiamGia.getTenGiamGia());
        maGiamGiaUpdate.setLoaiGiamGia(maGiamGia.getLoaiGiamGia());
        maGiamGiaUpdate.setGiaTriGiam(maGiamGia.getGiaTriGiam());
        maGiamGiaUpdate.setDonHangToiThieu(maGiamGia.getDonHangToiThieu());
        maGiamGiaUpdate.setGiamGiaToiDa(maGiamGia.getGiamGiaToiDa());
        maGiamGiaUpdate.setGioiHanSuDung(maGiamGia.getGioiHanSuDung());
        maGiamGiaUpdate.setMoTa(maGiamGia.getMoTa());
        maGiamGiaUpdate.setNgayBatDau(maGiamGia.getNgayBatDau());
        maGiamGiaUpdate.setNgayKetThuc(maGiamGia.getNgayKetThuc());
        return maGiamGiaRepository.save(maGiamGiaUpdate);
    }

    // Delete
    public void deleteMaGiamGia(Integer id) {
        MaGiamGia maGiamGia = getMaGiamGiaById(id);
        maGiamGiaRepository.delete(maGiamGia);
    }
}