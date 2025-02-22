package spring.api.apistart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.apistart.entity.ChiTietSanPham;
import spring.api.apistart.entity.SanPham;
import spring.api.apistart.repository.ChiTietSanPhamrepo;
import spring.api.apistart.repository.SanPhamrepo;

import java.util.List;
import java.util.Optional;

@Service
public class ChiTietSanPhamService {
    @Autowired
    private ChiTietSanPhamrepo chiTietSanPhamrepo;
    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamrepo.findAll();
    }
//add
    public ChiTietSanPham add(ChiTietSanPham chiTietSanPham){
    return chiTietSanPhamrepo.save(chiTietSanPham);
    }
//update
public  ChiTietSanPham update(Integer id,ChiTietSanPham chiTietSanPham){
    chiTietSanPham.setId(Integer.valueOf(id));
    return chiTietSanPhamrepo.save(chiTietSanPham);
}
    public void delete(Integer id) {
        chiTietSanPhamrepo.deleteById(id);
    }
}

