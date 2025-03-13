package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.HoaDon;
import spring.api.apistart.service.HoaDonService;

@RestController
@RequestMapping("/api/hoa-don")
public class HoaDonController {
    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping
    public Page<HoaDon> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "ngayTao") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return hoaDonService.getAll(pageable);
    }

    @GetMapping("/search")
    public Page<HoaDon> search(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "ngayTao") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return hoaDonService.search(keyword, pageable);
    }

    @GetMapping("/{id}")
    public HoaDon getById(@PathVariable Integer id) {
        return hoaDonService.getById(id);
    }

    @PostMapping
    public HoaDon add(@RequestBody HoaDon hoaDon) {
        return hoaDonService.add(hoaDon);
    }

    @PutMapping("/{id}")
    public HoaDon update(@PathVariable Integer id, @RequestBody HoaDon hoaDon) {
        return hoaDonService.update(id, hoaDon);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        hoaDonService.delete(id);
    }
}