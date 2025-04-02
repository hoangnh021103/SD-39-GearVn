package com.example.apistart.repository;

import com.example.apistart.entity.GioHangSpct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GioHangSpctRepository extends JpaRepository<GioHangSpct, Integer> {

}