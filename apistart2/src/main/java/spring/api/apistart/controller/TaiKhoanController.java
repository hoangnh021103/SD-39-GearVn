package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<TaiKhoan> getById(@PathVariable Integer id) {
        TaiKhoan taiKhoan = taiKhoanService.getById(id);
        return taiKhoan != null ? ResponseEntity.ok(taiKhoan) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public TaiKhoan add(@RequestBody TaiKhoan taiKhoan) {
        return taiKhoanService.add(taiKhoan);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaiKhoan> update(@PathVariable Integer id, @RequestBody TaiKhoan taiKhoan) {
        TaiKhoan updated = taiKhoanService.update(id, taiKhoan);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        taiKhoanService.delete(id);
        return ResponseEntity.noContent().build();
    }
}