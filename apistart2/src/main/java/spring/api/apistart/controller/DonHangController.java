package spring.api.apistart.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.dto.DonHangCustom;
import spring.api.apistart.entity.DonHang;
import spring.api.apistart.service.DonHangService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/donHang")
@RequiredArgsConstructor
public class DonHangController {
    @Autowired
    private DonHangService donHangService;

    // Lấy tất cả don hang
    @GetMapping
    public List<DonHangCustom> getAllDH() {
        return donHangService.getAllDH();
    }

    // Thêm DH mới
    @PostMapping
    public DonHang createDH(@RequestBody DonHang donHang) {
        return donHangService.createDH(donHang);
    }

    // Cập nhật thông tin DH
    @PutMapping("/{id}")
    public DonHang updateDH(@PathVariable Integer id, @RequestBody DonHang donHang) {
        return donHangService.updateDH(id, donHang);
    }

    // Xóa DH
    @DeleteMapping("/{id}")
    public void deleteDH(@PathVariable Integer id) {
        donHangService.deleteDH(id);
    }
}

