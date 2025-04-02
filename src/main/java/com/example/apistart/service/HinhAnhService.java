package com.example.apistart.service;

import com.example.apistart.entity.HinhAnh;
import com.example.apistart.repository.HinhAnhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HinhAnhService {
    @Autowired
    private HinhAnhRepository hinhAnhRepository;

    public List<HinhAnh> getAll() {
        return hinhAnhRepository.findAll();
    }

    public HinhAnh getById(Byte id) {
        return hinhAnhRepository.findById(id).orElse(null);
    }

    public HinhAnh save(HinhAnh hinhAnh) {
        return hinhAnhRepository.save(hinhAnh);
    }

    public void delete(Byte id) {
        hinhAnhRepository.deleteById(id);
    }
}