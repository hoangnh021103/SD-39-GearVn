package com.example.apistart.service;

import com.example.apistart.entity.TaiKhoan;
import com.example.apistart.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiKhoanService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    public List<TaiKhoan> getAll() {
        return taiKhoanRepository.findAll();
    }

    public TaiKhoan getById(Integer id) {
        return taiKhoanRepository.findById(id).orElse(null);
    }

    public TaiKhoan save(TaiKhoan taiKhoan) {
        return taiKhoanRepository.save(taiKhoan);
    }

    public void delete(Integer id) {
        taiKhoanRepository.deleteById(id);
    }
}