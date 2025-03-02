package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.KhachHang;
import spring.api.apistart.service.KhachHangService;

import java.util.List;

@RestController
@RequestMapping("/api/khach-hang")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping
    public List<KhachHang> getAll() {
        return khachHangService.getAll();
    }

    @GetMapping("/{id}")
    public KhachHang getById(@PathVariable Integer id) {
        return khachHangService.getById(id);
    }

    @PostMapping
    public KhachHang add(@RequestBody KhachHang khachHang) {
        return khachHangService.add(khachHang);
    }

    @PutMapping("/{id}")
    public KhachHang update(@PathVariable Integer id, @RequestBody KhachHang khachHang) {
        return khachHangService.update(id, khachHang);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        khachHangService.delete(id);
    }
}