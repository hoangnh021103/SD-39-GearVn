package controller;

import Entity.TaiKhoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TaiKhoanService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tai-khoan")
public class TaiKhoanController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    // Lấy tất cả tài khoản
    @GetMapping
    public List<TaiKhoan> getAllTaiKhoan() {
        return taiKhoanService.getAllTaiKhoan();
    }

    // Lấy tài khoản theo ID
    @GetMapping("/{id}")
    public Optional<TaiKhoan> getTaiKhoanById(@PathVariable Integer id) {
        return taiKhoanService.getTaiKhoanById(id);
    }

    // Thêm tài khoản mới
    @PostMapping
    public TaiKhoan createTaiKhoan(@RequestBody TaiKhoan taiKhoan) {
        return taiKhoanService.createTaiKhoan(taiKhoan);
    }

    // Cập nhật tài khoản
    @PutMapping("/{id}")
    public TaiKhoan updateTaiKhoan(@PathVariable Integer id, @RequestBody TaiKhoan taiKhoan) {
        return taiKhoanService.updateTaiKhoan(id, taiKhoan);
    }

    // Xóa tài khoản
    @DeleteMapping("/{id}")
    public void deleteTaiKhoan(@PathVariable Integer id) {
        taiKhoanService.deleteTaiKhoan(id);
    }
}
