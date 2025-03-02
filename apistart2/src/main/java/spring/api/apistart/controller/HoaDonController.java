package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.HoaDon;
import spring.api.apistart.service.HoaDonService;

import java.util.List;

@RestController
@RequestMapping("/api/hoa-don")
public class HoaDonController {
    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping
    public List<HoaDon> getAll() {
        return hoaDonService.getAll();
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