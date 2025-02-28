package spring.api.apistart.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.ChiTietSanPham;
import spring.api.apistart.service.ChiTietSanPhamService;

import java.util.List;

@RestController
@RequestMapping("/api/chi-tiet-san-pham")
public class ChiTietSanPhamController {

    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    // Create
    @PostMapping
    public ResponseEntity<ChiTietSanPham> createChiTietSanPham(@RequestBody ChiTietSanPham chiTietSanPham) {
        return ResponseEntity.ok(chiTietSanPhamService.createChiTietSanPham(chiTietSanPham));
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<ChiTietSanPham>> getAllChiTietSanPham() {
        return ResponseEntity.ok(chiTietSanPhamService.getAllChiTietSanPham());
    }

    // Read By ID
    @GetMapping("/{id}")
    public ResponseEntity<ChiTietSanPham> getChiTietSanPhamById(@PathVariable Integer id) {
        return ResponseEntity.ok(chiTietSanPhamService.getChiTietSanPhamById(id));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<ChiTietSanPham> updateChiTietSanPham(@PathVariable Integer id, @RequestBody ChiTietSanPham chiTietSanPham) {
        return ResponseEntity.ok(chiTietSanPhamService.updateChiTietSanPham(id, chiTietSanPham));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChiTietSanPham(@PathVariable Integer id) {
        chiTietSanPhamService.deleteChiTietSanPham(id);
        return ResponseEntity.noContent().build();
    }
}
