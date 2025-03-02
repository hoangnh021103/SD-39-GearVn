package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.NhanVien;
import spring.api.apistart.service.NhanVienService;

import java.util.List;

@RestController
@RequestMapping("/api/nhan-vien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping
    public List<NhanVien> getAll() {
        return nhanVienService.getAll();
    }

    @GetMapping("/{id}")
    public NhanVien getById(@PathVariable Integer id) {
        return nhanVienService.getById(id);
    }

    @PostMapping
    public NhanVien add(@RequestBody NhanVien nhanVien) {
        return nhanVienService.add(nhanVien);
    }

    @PutMapping("/{id}")
    public NhanVien update(@PathVariable Integer id, @RequestBody NhanVien nhanVien) {
        return nhanVienService.update(id, nhanVien);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        nhanVienService.delete(id);
    }
}