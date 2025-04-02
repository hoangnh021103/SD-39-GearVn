package com.example.apistart.repository;

import com.example.apistart.entity.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {

}