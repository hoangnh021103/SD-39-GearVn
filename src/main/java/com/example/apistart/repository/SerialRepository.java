package com.example.apistart.repository;

import com.example.apistart.entity.Serial;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SerialRepository extends JpaRepository<Serial, Integer> {
}
