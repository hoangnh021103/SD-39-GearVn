package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.SanPham;
import spring.api.apistart.service.SanPhamService;

@RestController
@RequestMapping("/api/san-pham")
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping
    public Page<SanPham> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "ten") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return sanPhamService.getAll(pageable);
    }

    @GetMapping("/search")
    public Page<SanPham> search(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "ten") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return sanPhamService.search(keyword, pageable);
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