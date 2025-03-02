package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.ChiTietSanPham;
import spring.api.apistart.service.ChiTietSanPhamService;

import java.util.List;

@RestController
@RequestMapping("/api/chi-tiet-san-pham")
public class ChiTietSanPhamController {
    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    @GetMapping
    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamService.getAll();
    }

    @GetMapping("/{id}")
    public ChiTietSanPham getById(@PathVariable Integer id) {
        return chiTietSanPhamService.getById(id);
    }

    @PostMapping
    public ChiTietSanPham add(@RequestBody ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamService.add(chiTietSanPham);
    }

    @PutMapping("/{id}")
    public ChiTietSanPham update(@PathVariable Integer id, @RequestBody ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamService.update(id, chiTietSanPham);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        chiTietSanPhamService.delete(id);
    }
}