package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.DonViVanChuyen;
import spring.api.apistart.service.DonViVanChuyenService;

import java.util.List;

@RestController
@RequestMapping("/api/don-vi-van-chuyen")
public class DonViVanChuyenController {
    @Autowired
    private DonViVanChuyenService donViVanChuyenService;

    @GetMapping
    public List<DonViVanChuyen> getAll() {
        return donViVanChuyenService.getAll();
    }

    @GetMapping("/{id}")
    public DonViVanChuyen getById(@PathVariable Integer id) {
        return donViVanChuyenService.getById(id);
    }

    @PostMapping
    public DonViVanChuyen add(@RequestBody DonViVanChuyen donViVanChuyen) {
        return donViVanChuyenService.add(donViVanChuyen);
    }

    @PutMapping("/{id}")
    public DonViVanChuyen update(@PathVariable Integer id, @RequestBody DonViVanChuyen donViVanChuyen) {
        return donViVanChuyenService.update(id, donViVanChuyen);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        donViVanChuyenService.delete(id);
    }
}