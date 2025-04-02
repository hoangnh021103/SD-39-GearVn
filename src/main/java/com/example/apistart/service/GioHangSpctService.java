package com.example.apistart.service;

import com.example.apistart.entity.GioHangSpct;
import com.example.apistart.repository.GioHangSpctRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangSpctService {
    @Autowired
    private GioHangSpctRepository gioHangSpctRepository;

    public List<GioHangSpct> getAll() {
        return gioHangSpctRepository.findAll();
    }

    public GioHangSpct getById(Integer id) {
        return gioHangSpctRepository.findById(id).orElse(null);
    }

    public GioHangSpct save(GioHangSpct gioHangSpct) {
        return gioHangSpctRepository.save(gioHangSpct);
    }

    public void delete(Integer id) {
        gioHangSpctRepository.deleteById(id);
    }
}