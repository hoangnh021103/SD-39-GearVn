package spring.api.apistart.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.DonHang;
import spring.api.apistart.service.DonHangService;

import java.util.List;

@RestController
@RequestMapping("/api/don-hang")
public class DonHangController {

    @Autowired
    private DonHangService donHangService;

    // Create
    @PostMapping
    public ResponseEntity<DonHang> createDonHang(@RequestBody DonHang donHang) {
        return ResponseEntity.ok(donHangService.createDonHang(donHang));
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<DonHang>> getAllDonHang() {
        return ResponseEntity.ok(donHangService.getAllDonHang());
    }

    // Read By ID
    @GetMapping("/{id}")
    public ResponseEntity<DonHang> getDonHangById(@PathVariable Integer id) {
        return ResponseEntity.ok(donHangService.getDonHangById(id));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<DonHang> updateDonHang(@PathVariable Integer id, @RequestBody DonHang donHang) {
        return ResponseEntity.ok(donHangService.updateDonHang(id, donHang));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDonHang(@PathVariable Integer id) {
        donHangService.deleteDonHang(id);
        return ResponseEntity.noContent().build();
    }
}
