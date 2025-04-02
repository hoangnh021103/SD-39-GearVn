package com.example.apistart.service;

import com.example.apistart.entity.MauSac;
import com.example.apistart.repository.MauSacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MauSacService {
    @Autowired
    private MauSacRepository mauSacRepository;

    public List<MauSac> getAll() {
        return mauSacRepository.findAll();
    }

    public MauSac getById(Byte id) {
        return mauSacRepository.findById(id).orElse(null);
    }

    public MauSac save(MauSac mauSac) {
        return mauSacRepository.save(mauSac);
    }

    public void delete(Byte id) {
        mauSacRepository.deleteById(id);
    }
}