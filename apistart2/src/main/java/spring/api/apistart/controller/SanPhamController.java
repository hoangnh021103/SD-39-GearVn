package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.SanPham;
import spring.api.apistart.service.SanPhamService;

import java.util.List;

@RestController
@RequestMapping("/api/san-pham")
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping
    public List<SanPham> getAll() {
        return sanPhamService.getAll();
    }

    @GetMapping("/{id}")
    public SanPham getById(@PathVariable Integer id) {
        return sanPhamService.getById(id);
    }

    @PostMapping
    public SanPham add(@RequestBody SanPham sanPham) {
        return sanPhamService.add(sanPham);
    }

    @PutMapping("/{id}")
    public SanPham update(@PathVariable Integer id, @RequestBody SanPham sanPham) {
        return sanPhamService.update(id, sanPham);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        sanPhamService.delete(id);
    }
}