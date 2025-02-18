package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.api.apistart.service.ChiTietSanPhamService;

@RestController
@RequestMapping("/api/sanPhamchitiet")
public class ChiTietSanPhamController {
    @Autowired
    private ChiTietSanPhamService service;
    @GetMapping()
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
