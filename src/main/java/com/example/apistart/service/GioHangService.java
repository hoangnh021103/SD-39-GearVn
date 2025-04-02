package com.example.apistart.service;

import com.example.apistart.entity.GioHang;
import com.example.apistart.repository.GioHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangService {
    @Autowired
    private GioHangRepository gioHangRepository;

    public List<GioHang> getAll() {
        return gioHangRepository.findAll();
    }

    public GioHang getById(Integer id) {
        return gioHangRepository.findById(id).orElse(null);
    }

    public GioHang save(GioHang gioHang) {
        return gioHangRepository.save(gioHang);
    }

    public void delete(Integer id) {
        gioHangRepository.deleteById(id);
    }
}