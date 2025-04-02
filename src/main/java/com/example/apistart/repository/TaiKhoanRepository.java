package com.example.apistart.repository;

import com.example.apistart.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Integer> {
}