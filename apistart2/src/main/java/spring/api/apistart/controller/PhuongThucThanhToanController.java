package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.PhuongThucThanhToan;
import spring.api.apistart.service.PhuongThucThanhToanService;

@RestController
@RequestMapping("/api/phuong-thuc-thanh-toan")
public class PhuongThucThanhToanController {
    @Autowired
    private PhuongThucThanhToanService phuongThucThanhToanService;

    @GetMapping
    public Page<PhuongThucThanhToan> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return phuongThucThanhToanService.getAll(pageable);
    }

    @GetMapping("/{id}")
    public PhuongThucThanhToan getById(@PathVariable Integer id) {
        return phuongThucThanhToanService.getById(id);
    }

    @PostMapping
    public PhuongThucThanhToan add(@RequestBody PhuongThucThanhToan pttt) {
        return phuongThucThanhToanService.add(pttt);
    }

    @PutMapping("/{id}")
    public PhuongThucThanhToan update(@PathVariable Integer id, @RequestBody PhuongThucThanhToan pttt) {
        return phuongThucThanhToanService.update(id, pttt);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        phuongThucThanhToanService.delete(id);
    }
}