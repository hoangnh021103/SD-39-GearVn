package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.ChiTietSanPham;
import spring.api.apistart.service.ChiTietSanPhamService;

@RestController
@RequestMapping("/api/chi-tiet-san-pham")
public class ChiTietSanPhamController {
    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    @GetMapping
    public Page<ChiTietSanPham> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return chiTietSanPhamService.getAll(pageable);
    }

    @GetMapping("/search")
    public Page<ChiTietSanPham> search(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return chiTietSanPhamService.search(keyword, pageable);
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