package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.ChiTietSanPham;
import spring.api.apistart.repository.ChiTietSanPhamRepository;

import java.util.List;

@Service
public class ChiTietSanPhamService {
    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamRepository.findAll();
    }

    public Page<ChiTietSanPham> getAll(Pageable pageable) {
        return chiTietSanPhamRepository.findAll(pageable);
    }

    public Page<ChiTietSanPham> search(String keyword, Pageable pageable) {
        return chiTietSanPhamRepository.findBySanPham_TenContainingOrMauSac_TenMauContaining(keyword, keyword, pageable);
    }

    public ChiTietSanPham getById(Integer id) {
        return chiTietSanPhamRepository.findById(id).orElse(null);
    }

    public ChiTietSanPham add(ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamRepository.save(chiTietSanPham);
    }

    public ChiTietSanPham update(Integer id, ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamRepository.findById(id)
                .map(existing -> {
                    existing.setSanPham(chiTietSanPham.getSanPham());
                    existing.setMauSac(chiTietSanPham.getMauSac());
                    existing.setHinhAnh(chiTietSanPham.getHinhAnh());
                    existing.setRam(chiTietSanPham.getRam());
                    existing.setCpu(chiTietSanPham.getCpu());
                    existing.setOCung(chiTietSanPham.getOCung());
                    existing.setCardDoHoa(chiTietSanPham.getCardDoHoa());
                    existing.setManHinh(chiTietSanPham.getManHinh());
                    existing.setDoPhanGiai(chiTietSanPham.getDoPhanGiai());
                    existing.setBanPhim(chiTietSanPham.getBanPhim());
                    existing.setPin(chiTietSanPham.getPin());
                    existing.setTrongLuong(chiTietSanPham.getTrongLuong());
                    existing.setHeDieuHanh(chiTietSanPham.getHeDieuHanh());
                    return chiTietSanPhamRepository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Integer id) {
        chiTietSanPhamRepository.deleteById(id);
    }
}