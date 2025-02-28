package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.ChiTietSanPham;
import spring.api.apistart.repository.ChiTietSanPhamrepository;

import java.util.List;

@Service
public class ChiTietSanPhamService {

    @Autowired
    private ChiTietSanPhamrepository chiTietSanPhamRepository;

    // Create
    public ChiTietSanPham createChiTietSanPham(ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamRepository.save(chiTietSanPham);
    }

    // Read All
    public List<ChiTietSanPham> getAllChiTietSanPham() {
        return chiTietSanPhamRepository.findAll();
    }

    // Read By ID
    public ChiTietSanPham getChiTietSanPhamById(Integer id) {
        return chiTietSanPhamRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy chi tiết sản phẩm"));
    }

    // Update
    public ChiTietSanPham updateChiTietSanPham(Integer id, ChiTietSanPham chiTietSanPham) {
        ChiTietSanPham chiTietSanPhamUpdate = getChiTietSanPhamById(id);
        chiTietSanPhamUpdate.setSanPham(chiTietSanPham.getSanPham());
        chiTietSanPhamUpdate.setSoLuong(chiTietSanPham.getSoLuong());
        chiTietSanPhamUpdate.setSerial(chiTietSanPham.getSerial());
        chiTietSanPhamUpdate.setViXuLy(chiTietSanPham.getViXuLy());
        chiTietSanPhamUpdate.setRam(chiTietSanPham.getRam());
        chiTietSanPhamUpdate.setLuuTru(chiTietSanPham.getLuuTru());
        chiTietSanPhamUpdate.setCardDoHoa(chiTietSanPham.getCardDoHoa());
        chiTietSanPhamUpdate.setManHinh(chiTietSanPham.getManHinh());
        chiTietSanPhamUpdate.setDoPhanGiai(chiTietSanPham.getDoPhanGiai());
        chiTietSanPhamUpdate.setPin(chiTietSanPham.getPin());
        chiTietSanPhamUpdate.setTrongLuong(chiTietSanPham.getTrongLuong());
        chiTietSanPhamUpdate.setHeDieuHanh(chiTietSanPham.getHeDieuHanh());
        return chiTietSanPhamRepository.save(chiTietSanPhamUpdate);
    }

    // Delete
    public void deleteChiTietSanPham(Integer id) {
        ChiTietSanPham chiTietSanPham = getChiTietSanPhamById(id);
        chiTietSanPhamRepository.delete(chiTietSanPham);
    }
}
