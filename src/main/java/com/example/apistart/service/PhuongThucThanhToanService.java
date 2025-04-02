package com.example.apistart.service;

import com.example.apistart.entity.PhuongThucThanhToan;
import com.example.apistart.repository.PhuongThucThanhToanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhuongThucThanhToanService {
    @Autowired
    private PhuongThucThanhToanRepository phuongThucThanhToanRepository;

    public List<PhuongThucThanhToan> getAll() {
        return phuongThucThanhToanRepository.findAll();
    }

    public PhuongThucThanhToan getById(Integer id) {
        return phuongThucThanhToanRepository.findById(id).orElse(null);
    }

    public PhuongThucThanhToan save(PhuongThucThanhToan phuongThucThanhToan) {
        return phuongThucThanhToanRepository.save(phuongThucThanhToan);
    }

    public void delete(Integer id) {
        phuongThucThanhToanRepository.deleteById(id);
    }
}