package spring.api.apistart.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.api.apistart.service.TaiKhoanService;

@RestController
@RequestMapping("/api/taiKhoan")
public class TaiKhoanController {
    @Autowired
    private TaiKhoanService service;

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}

