package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.SanPham;
import spring.api.apistart.service.SanPhamService;

import java.util.List;

@RestController
@RequestMapping("/api/san-pham")
public class SanPhamController {

    @Autowired
    private SanPhamService sanPhamService;

    // Create
    @PostMapping
    public ResponseEntity<SanPham> createSanPham(@RequestBody SanPham sanPham) {
        return ResponseEntity.ok(sanPhamService.createSanPham(sanPham));
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<SanPham>> getAllSanPham() {
        return ResponseEntity.ok(sanPhamService.getAllSanPham());
    }

    // Read By ID
    @GetMapping("/{id}")
    public ResponseEntity<SanPham> getSanPhamById(@PathVariable Integer id) {
        return ResponseEntity.ok(sanPhamService.getSanPhamById(id));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<SanPham> updateSanPham(@PathVariable Integer id, @RequestBody SanPham sanPham) {
        return ResponseEntity.ok(sanPhamService.updateSanPham(id, sanPham));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSanPham(@PathVariable Integer id) {
        sanPhamService.deleteSanPham(id);
        return ResponseEntity.noContent().build();
    }
}
