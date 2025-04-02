package com.example.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "don_vi_van_chuyen")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonViVanChuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten", nullable = false, length = 50)
    private String ten;

    @Column(name = "so_dien_thoai", length = 20)
    private String soDienThoai;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "trang_thai", nullable = false)
    private Byte trangThai = 0; // 0: Hoạt động, 2: Nghỉ việc
}