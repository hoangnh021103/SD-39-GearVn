package com.example.apistart.service;

import com.example.apistart.entity.Serial;
import com.example.apistart.repository.SerialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerialService {
    @Autowired
    private SerialRepository serialRepository;

    public List<Serial> getAll() {
        return serialRepository.findAll();
    }

    public Serial getById(Integer id) {
        return serialRepository.findById(id).orElse(null);
    }

    public Serial save(Serial serial) {
        return serialRepository.save(serial);
    }

    public void delete(Integer id) {
        serialRepository.deleteById(id);
    }
}