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

    // Create
    @PostMapping
    public ResponseEntity<TaiKhoan> createTaiKhoan(@RequestBody TaiKhoan taiKhoan) {
        return ResponseEntity.ok(taiKhoanService.createTaiKhoan(taiKhoan));
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<TaiKhoan>> getAll() {
        return ResponseEntity.ok(taiKhoanService.getAllTaiKhoan());
    }

    // Read By ID
    @GetMapping("/{id}")
    public ResponseEntity<TaiKhoan> getTaiKhoanById(@PathVariable Integer id) {
        return ResponseEntity.ok(taiKhoanService.getTaiKhoanById(id));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<TaiKhoan> updateTaiKhoan(@PathVariable Integer id, @RequestBody TaiKhoan taiKhoan) {
        return ResponseEntity.ok(taiKhoanService.updateTaiKhoan(id, taiKhoan));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaiKhoan(@PathVariable Integer id) {
        taiKhoanService.deleteTaiKhoan(id);
        return ResponseEntity.noContent().build();
    }
}
