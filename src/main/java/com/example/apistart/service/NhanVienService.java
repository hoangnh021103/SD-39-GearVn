package com.example.apistart.service;

import com.example.apistart.entity.NhanVien;
import com.example.apistart.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;

    public List<NhanVien> getAll() {
        return nhanVienRepository.findAll();
    }

    public NhanVien getById(Integer id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

    public NhanVien save(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    public void delete(Integer id) {
        nhanVienRepository.deleteById(id);
    }
}