package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.ChiTietHoaDon;
import spring.api.apistart.service.ChiTietHoaDonService;

@RestController
@RequestMapping("/api/chi-tiet-hoa-don")
public class ChiTietHoaDonController {
    @Autowired
    private ChiTietHoaDonService chiTietHoaDonService;

    @GetMapping
    public Page<ChiTietHoaDon> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return chiTietHoaDonService.getAll(pageable);
    }

    @GetMapping("/search")
    public Page<ChiTietHoaDon> search(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return chiTietHoaDonService.search(keyword, pageable);
    }

    @GetMapping("/{id}")
    public ChiTietHoaDon getById(@PathVariable Integer id) {
        return chiTietHoaDonService.getById(id);
    }

    @PostMapping
    public ChiTietHoaDon add(@RequestBody ChiTietHoaDon chiTietHoaDon) {
        return chiTietHoaDonService.add(chiTietHoaDon);
    }

    @PutMapping("/{id}")
    public ChiTietHoaDon update(@PathVariable Integer id, @RequestBody ChiTietHoaDon chiTietHoaDon) {
        return chiTietHoaDonService.update(id, chiTietHoaDon);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        chiTietHoaDonService.delete(id);
    }
}