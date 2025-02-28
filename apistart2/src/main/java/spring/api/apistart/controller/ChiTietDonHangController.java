package spring.api.apistart.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.ChiTietDonHang;
import spring.api.apistart.service.ChiTietDonHangService;

import java.util.List;

@RestController
@RequestMapping("/api/chi-tiet-don-hang")
public class ChiTietDonHangController {

    @Autowired
    private ChiTietDonHangService chiTietDonHangService;

    // Create
    @PostMapping
    public ResponseEntity<ChiTietDonHang> createChiTietDonHang(@RequestBody ChiTietDonHang chiTietDonHang) {
        return ResponseEntity.ok(chiTietDonHangService.createChiTietDonHang(chiTietDonHang));
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<ChiTietDonHang>> getAllChiTietDonHang() {
        return ResponseEntity.ok(chiTietDonHangService.getAllChiTietDonHang());
    }

    // Read By ID
    @GetMapping("/{id}")
    public ResponseEntity<ChiTietDonHang> getChiTietDonHangById(@PathVariable Integer id) {
        return ResponseEntity.ok(chiTietDonHangService.getChiTietDonHangById(id));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<ChiTietDonHang> updateChiTietDonHang(@PathVariable Integer id, @RequestBody ChiTietDonHang chiTietDonHang) {
        return ResponseEntity.ok(chiTietDonHangService.updateChiTietDonHang(id, chiTietDonHang));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChiTietDonHang(@PathVariable Integer id) {
        chiTietDonHangService.deleteChiTietDonHang(id);
        return ResponseEntity.noContent().build();
    }
}