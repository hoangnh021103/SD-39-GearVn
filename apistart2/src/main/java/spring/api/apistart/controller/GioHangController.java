package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.GioHang;
import spring.api.apistart.service.GioHangService;

import java.util.List;

@RestController
@RequestMapping("/api/gio-hang")
public class GioHangController {
    @Autowired
    private GioHangService gioHangService;

    @GetMapping
    public List<GioHang> getAll() {
        return gioHangService.getAll();
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