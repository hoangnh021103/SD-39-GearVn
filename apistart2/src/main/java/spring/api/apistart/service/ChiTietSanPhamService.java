package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.ChiTietSanPham;
import spring.api.apistart.entity.SanPham;
import spring.api.apistart.repository.ChiTietSanPhamrepo;
import spring.api.apistart.repository.SanPhamrepo;

import java.util.List;
@Service
public class ChiTietSanPhamService {
    @Autowired
    private ChiTietSanPhamrepo chiTietSanPhamrepo;
    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamrepo.findAll();
    }
}
