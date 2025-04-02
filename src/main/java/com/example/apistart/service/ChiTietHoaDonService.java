package com.example.apistart.service;

import com.example.apistart.entity.ChiTietHoaDon;
import com.example.apistart.repository.ChiTietHoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietHoaDonService {
    @Autowired
    private ChiTietHoaDonRepository chiTietHoaDonRepository;

    public List<ChiTietHoaDon> getAll() {
        return chiTietHoaDonRepository.findAll();
    }

    public ChiTietHoaDon getById(Integer id) {
        return chiTietHoaDonRepository.findById(id).orElse(null);
    }

    public ChiTietHoaDon save(ChiTietHoaDon chiTietHoaDon) {
        return chiTietHoaDonRepository.save(chiTietHoaDon);
    }

    public void delete(Integer id) {
        chiTietHoaDonRepository.deleteById(id);
    }
}