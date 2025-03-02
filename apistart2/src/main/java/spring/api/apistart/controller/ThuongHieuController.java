package spring.api.apistart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.apistart.entity.ThuongHieu;
import spring.api.apistart.service.ThuongHieuService;

import java.util.List;

@RestController
@RequestMapping("/api/thuong-hieu")
public class ThuongHieuController {
    @Autowired
    private ThuongHieuService thuongHieuService;

    @GetMapping
    public List<ThuongHieu> getAll() {
        return thuongHieuService.getAll();
    }

    @GetMapping("/{id}")
    public ThuongHieu getById(@PathVariable Integer id) {
        return thuongHieuService.getById(id);
    }

    @PostMapping
    public ThuongHieu add(@RequestBody ThuongHieu thuongHieu) {
        return thuongHieuService.add(thuongHieu);
    }

    @PutMapping("/{id}")
    public ThuongHieu update(@PathVariable Integer id, @RequestBody ThuongHieu thuongHieu) {
        return thuongHieuService.update(id, thuongHieu);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        thuongHieuService.delete(id);
    }
}