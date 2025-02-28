package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.MaGiamGia;
import spring.api.apistart.service.MaGiamGiaService;

import java.util.List;

@RestController
@RequestMapping("/api/ma-giam-gia")
public class MaGiamGiaController {

    @Autowired
    private MaGiamGiaService maGiamGiaService;

    // Create
    @PostMapping
    public ResponseEntity<MaGiamGia> createMaGiamGia(@RequestBody MaGiamGia maGiamGia) {
        return ResponseEntity.ok(maGiamGiaService.createMaGiamGia(maGiamGia));
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<MaGiamGia>> getAllMaGiamGia() {
        return ResponseEntity.ok(maGiamGiaService.getAllMaGiamGia());
    }

    // Read By ID
    @GetMapping("/{id}")
    public ResponseEntity<MaGiamGia> getMaGiamGiaById(@PathVariable Integer id) {
        return ResponseEntity.ok(maGiamGiaService.getMaGiamGiaById(id));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<MaGiamGia> updateMaGiamGia(@PathVariable Integer id, @RequestBody MaGiamGia maGiamGia) {
        return ResponseEntity.ok(maGiamGiaService.updateMaGiamGia(id, maGiamGia));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMaGiamGia(@PathVariable Integer id) {
        maGiamGiaService.deleteMaGiamGia(id);
        return ResponseEntity.noContent().build();
    }
}
