package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.GioHangSpct;
import spring.api.apistart.service.GioHangSanPhamChiTietService;


@RestController
@RequestMapping("/api/gio-hang-spct")
public class GioHangSanPhamChiTietController {
    @Autowired
    private GioHangSanPhamChiTietService gioHangSpctService;

    @GetMapping
    public Page<GioHangSpct> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return gioHangSpctService.getAll(pageable);
    }

    @GetMapping("/search")
    public Page<GioHangSpct> search(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return gioHangSpctService.search(keyword, pageable);
    }

    @GetMapping("/{id}")
    public GioHangSpct getById(@PathVariable Integer id) {
        return gioHangSpctService.getById(id);
    }

    @PostMapping
    public GioHangSpct add(@RequestBody GioHangSpct gioHangSpct) {
        return gioHangSpctService.add(gioHangSpct);
    }

    @PutMapping("/{id}")
    public GioHangSpct update(@PathVariable Integer id, @RequestBody GioHangSpct gioHangSpct) {
        return gioHangSpctService.update(id, gioHangSpct);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        gioHangSpctService.delete(id);
    }
}