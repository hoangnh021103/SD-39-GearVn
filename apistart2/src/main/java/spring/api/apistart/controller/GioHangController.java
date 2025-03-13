package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.GioHang;
import spring.api.apistart.service.GioHangService;

@RestController
@RequestMapping("/api/gio-hang")
public class GioHangController {
    @Autowired
    private GioHangService gioHangService;

    @GetMapping
    public Page<GioHang> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return gioHangService.getAll(pageable);
    }

    @GetMapping("/search")
    public Page<GioHang> search(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return gioHangService.search(keyword, pageable);
    }

    @GetMapping("/{id}")
    public GioHang getById(@PathVariable Integer id) {
        return gioHangService.getById(id);
    }

    @PostMapping
    public GioHang add(@RequestBody GioHang gioHang) {
        return gioHangService.add(gioHang);
    }

    @PutMapping("/{id}")
    public GioHang update(@PathVariable Integer id, @RequestBody GioHang gioHang) {
        return gioHangService.update(id, gioHang);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        gioHangService.delete(id);
    }
}