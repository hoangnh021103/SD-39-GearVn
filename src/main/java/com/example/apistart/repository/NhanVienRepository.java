package com.example.apistart.repository;

import com.example.apistart.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
}