package com.example.apistart.service;

import com.example.apistart.entity.KhachHang;
import com.example.apistart.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;

    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }

    public KhachHang getById(Integer id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    public KhachHang save(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    public void delete(Integer id) {
        khachHangRepository.deleteById(id);
    }
}