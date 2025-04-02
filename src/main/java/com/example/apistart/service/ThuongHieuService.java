package com.example.apistart.service;

import com.example.apistart.entity.ThuongHieu;
import com.example.apistart.repository.ThuongHieuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThuongHieuService {
    @Autowired
    private ThuongHieuRepository thuongHieuRepository;

    public List<ThuongHieu> getAll() {
        return thuongHieuRepository.findAll();
    }

    public ThuongHieu getById(Integer id) {
        return thuongHieuRepository.findById(id).orElse(null);
    }

    public ThuongHieu save(ThuongHieu thuongHieu) {
        return thuongHieuRepository.save(thuongHieu);
    }

    public void delete(Integer id) {
        thuongHieuRepository.deleteById(id);
    }
}