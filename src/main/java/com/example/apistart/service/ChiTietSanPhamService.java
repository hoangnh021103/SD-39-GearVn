package com.example.apistart.service;

import com.example.apistart.entity.ChiTietSanPham;
import com.example.apistart.repository.ChiTietSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietSanPhamService {
    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamRepository.findAll();
    }

    public ChiTietSanPham getById(Integer id) {
        return chiTietSanPhamRepository.findById(id).orElse(null);
    }

    public ChiTietSanPham save(ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamRepository.save(chiTietSanPham);
    }

    public void delete(Integer id) {
        chiTietSanPhamRepository.deleteById(id);
    }
}