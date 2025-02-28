package spring.api.apistart.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.KhachHang;
import spring.api.apistart.service.KhachHangService;

import java.util.List;

@RestController
@RequestMapping("/api/khach-hang")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    // Create
    @PostMapping
    public ResponseEntity<KhachHang> createKhachHang(@RequestBody KhachHang khachHang) {
        return ResponseEntity.ok(khachHangService.createKhachHang(khachHang));
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<KhachHang>> getAllKhachHang() {
        return ResponseEntity.ok(khachHangService.getAllKhachHang());
    }

    // Read By ID
    @GetMapping("/{id}")
    public ResponseEntity<KhachHang> getKhachHangById(@PathVariable Integer id) {
        return ResponseEntity.ok(khachHangService.getKhachHangById(id));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<KhachHang> updateKhachHang(@PathVariable Integer id, @RequestBody KhachHang khachHang) {
        return ResponseEntity.ok(khachHangService.updateKhachHang(id, khachHang));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKhachHang(@PathVariable Integer id) {
        khachHangService.deleteKhachHang(id);
        return ResponseEntity.noContent().build();
    }
}
