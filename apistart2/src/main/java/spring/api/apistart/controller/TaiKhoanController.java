package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.TaiKhoan;
import spring.api.apistart.service.TaiKhoanService;

import java.util.List;

@RestController
@RequestMapping("/api/tai-khoan")
public class TaiKhoanController {
    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping
    public List<TaiKhoan> getAll() {
        return taiKhoanService.getAll();
    }

    @GetMapping("/{id}")
    public TaiKhoan getById(@PathVariable Integer id) {
        return taiKhoanService.getById(id);
    }

    @PostMapping
    public TaiKhoan add(@RequestBody TaiKhoan taiKhoan) {
        return taiKhoanService.add(taiKhoan);
    }

    @PutMapping("/{id}")
    public TaiKhoan update(@PathVariable Integer id, @RequestBody TaiKhoan taiKhoan) {
        return taiKhoanService.update(id, taiKhoan);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        taiKhoanService.delete(id);
    }
}