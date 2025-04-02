package com.example.apistart.repository;

import com.example.apistart.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;


public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
}