package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.ChiTietHoaDon;
import spring.api.apistart.service.ChiTietHoaDonService;

import java.util.List;

@RestController
@RequestMapping("/api/chi-tiet-hoa-don")
public class ChiTietHoaDonController {
    @Autowired
    private ChiTietHoaDonService chiTietHoaDonService;

    @GetMapping
    public List<ChiTietHoaDon> getAll() {
        return chiTietHoaDonService.getAll();
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