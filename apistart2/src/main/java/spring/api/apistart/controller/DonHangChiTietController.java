package spring.api.apistart.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.DonHangChiTiet;
import spring.api.apistart.service.DonHangChiTietService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/don-hang-chi-tiet")
@RequiredArgsConstructor
public class DonHangChiTietController {

    @Autowired
    private DonHangChiTietService donHangChiTietService;

    // Lấy tất cả don hang chi tiet
    @GetMapping
    public List<DonHangChiTiet> getAllDH() {
        return donHangChiTietService.getAllDHCT();
    }

    // Lấy DHCT theo ID
    @GetMapping("/{id}")
    public Optional<DonHangChiTiet> getMaGGById(@PathVariable Integer id) {
        return donHangChiTietService.getDHCTById(id);
    }

    // Thêm DHCT mới
    @PostMapping
    public DonHangChiTiet createDH(@RequestBody DonHangChiTiet donHangChiTiet) {
        return donHangChiTietService.createDHCT(donHangChiTiet);
    }

    // Cập nhật thông tin DHCT
    @PutMapping("/{id}")
    public DonHangChiTiet updateDH(@PathVariable Integer id, @RequestBody DonHangChiTiet donHangChiTiet) {
        return donHangChiTietService.updateDHCT(id, donHangChiTiet);
    }

    // Xóa DHCT
    @DeleteMapping("/{id}")
    public void deleteDHCT(@PathVariable Integer id) {
        donHangChiTietService.deleteDHCT(id);
    }
}

