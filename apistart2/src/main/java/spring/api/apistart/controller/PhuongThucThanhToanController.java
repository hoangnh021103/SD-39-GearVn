package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.PhuongThucThanhToan;
import spring.api.apistart.service.PhuongThucThanhToanService;

import java.util.List;

@RestController
@RequestMapping("/api/phuong-thuc-thanh-toan")
public class PhuongThucThanhToanController {
    @Autowired
    private PhuongThucThanhToanService phuongThucThanhToanService;

    @GetMapping
    public List<PhuongThucThanhToan> getAll() {
        return phuongThucThanhToanService.getAll();
    }

    @GetMapping("/{id}")
    public PhuongThucThanhToan getById(@PathVariable Integer id) {
        return phuongThucThanhToanService.getById(id);
    }

    @PostMapping
    public PhuongThucThanhToan add(@RequestBody PhuongThucThanhToan phuongThucThanhToan) {
        return phuongThucThanhToanService.add(phuongThucThanhToan);
    }

    @PutMapping("/{id}")
    public PhuongThucThanhToan update(@PathVariable Integer id, @RequestBody PhuongThucThanhToan phuongThucThanhToan) {
        return phuongThucThanhToanService.update(id, phuongThucThanhToan);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        phuongThucThanhToanService.delete(id);
    }
}