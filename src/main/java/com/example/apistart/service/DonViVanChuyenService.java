package com.example.apistart.service;

import com.example.apistart.entity.DonViVanChuyen;
import com.example.apistart.repository.DonViVanChuyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonViVanChuyenService {
    @Autowired
    private DonViVanChuyenRepository donViVanChuyenRepository;

    public List<DonViVanChuyen> getAll() {
        return donViVanChuyenRepository.findAll();
    }

    public DonViVanChuyen getById(Integer id) {
        return donViVanChuyenRepository.findById(id).orElse(null);
    }

    public DonViVanChuyen save(DonViVanChuyen donViVanChuyen) {
        return donViVanChuyenRepository.save(donViVanChuyen);
    }

    public void delete(Integer id) {
        donViVanChuyenRepository.deleteById(id);
    }
}