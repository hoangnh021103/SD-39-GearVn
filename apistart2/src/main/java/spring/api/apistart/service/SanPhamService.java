package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.NhanVien;
import spring.api.apistart.entity.SanPham;
import spring.api.apistart.repository.NhanVienrepo;
import spring.api.apistart.repository.SanPhamrepo;

import java.util.List;

@Service
public class SanPhamService {
    @Autowired
    private SanPhamrepo repo;
    public List<SanPham> getAll() {
        return repo.findAll();
    }
}

