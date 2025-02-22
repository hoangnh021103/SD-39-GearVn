package spring.api.apistart.controller;
import spring.api.apistart.dto.MaGiamGiaCustom;
import spring.api.apistart.entity.MaGiamGia;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.service.MaGiamGiaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/maGiamgia")
@RequiredArgsConstructor
public class MaGiamGiaController {

    @Autowired
    private MaGiamGiaService maGiamGiaService;

    // Lấy tất cả ma
    @GetMapping
    public List<MaGiamGiaCustom> getAllMaGG() {
        return maGiamGiaService.getAllMaGG();
    }
    // Thêm ma mới
    @PostMapping
    public MaGiamGia createMaGG(@RequestBody MaGiamGia maGiamGia) {
        return maGiamGiaService.createMaGG(maGiamGia);
    }

    // Cập nhật thông tin ma
    @PutMapping("/{id}")
    public MaGiamGia updateMaGG(@PathVariable Integer id, @RequestBody MaGiamGia maGiamGia) {
        return maGiamGiaService.updateMaGG(id, maGiamGia);
    }

    // Xóa ma
    @DeleteMapping("/{id}")
    public void deleteKhachHang(@PathVariable Integer id) {
        maGiamGiaService.deleteMaGG(id);
    }
}
