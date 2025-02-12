package controller;


import Entity.KhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.KhachHangService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/khach-hang")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    // Lấy tất cả khách hàng
    @GetMapping
    public List<KhachHang> getAllKhachHang() {
        return khachHangService.getAllKhachHang();
    }

    // Lấy khách hàng theo ID
    @GetMapping("/{id}")
    public Optional<KhachHang> getKhachHangById(@PathVariable String id) {
        return khachHangService.getKhachHangById(id);
    }

    // Thêm khách hàng mới
    @PostMapping
    public KhachHang createKhachHang(@RequestBody KhachHang khachHang) {
        return khachHangService.createKhachHang(khachHang);
    }

    // Cập nhật thông tin khách hàng
    @PutMapping("/{id}")
    public KhachHang updateKhachHang(@PathVariable String id, @RequestBody KhachHang khachHang) {
        return khachHangService.updateKhachHang(id, khachHang);
    }

    // Xóa khách hàng
    @DeleteMapping("/{id}")
    public void deleteKhachHang(@PathVariable String id) {
        khachHangService.deleteKhachHang(id);
    }
}

