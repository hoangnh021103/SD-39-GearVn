package controller;

import Entity.NhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.NhanVienService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nhan-vien")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    // Lấy tất cả nhân viên
    @GetMapping
    public List<NhanVien> getAllNhanVien() {
        return nhanVienService.getAllNhanVien();
    }

    // Lấy nhân viên theo ID
    @GetMapping("/{id}")
    public Optional<NhanVien> getNhanVienById(@PathVariable String id) {
        return nhanVienService.getNhanVienById(id);
    }

    // Thêm nhân viên mới
    @PostMapping
    public NhanVien createNhanVien(@RequestBody NhanVien nhanVien) {
        return nhanVienService.createNhanVien(nhanVien);
    }

    // Cập nhật thông tin nhân viên
    @PutMapping("/{id}")
    public NhanVien updateNhanVien(@PathVariable String id, @RequestBody NhanVien nhanVien) {
        return nhanVienService.updateNhanVien(id, nhanVien);
    }

    // Xóa nhân viên
    @DeleteMapping("/{id}")
    public void deleteNhanVien(@PathVariable String id) {
        nhanVienService.deleteNhanVien(id);
    }
}
