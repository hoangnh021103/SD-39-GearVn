package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.GioHangSpct;
import spring.api.apistart.service.GioHangSanPhamChiTietService;


import java.util.List;

@RestController
@RequestMapping("/api/gio-hang-spct")

public class GioHangSanPhamChiTietController {
    @Autowired
    private GioHangSanPhamChiTietService gioHangSpctService;

    @GetMapping
    public List<GioHangSpct> getAll() {
        return gioHangSpctService.getAll();
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
