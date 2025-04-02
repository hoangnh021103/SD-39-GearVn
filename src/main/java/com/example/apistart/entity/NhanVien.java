package com.example.apistart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "nhan_vien")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tai_khoan_id")
    private TaiKhoan taiKhoan;

    @Column(name = "ho", nullable = false, length = 50)
    private String ho;

    @Column(name = "ten", nullable = false, length = 50)
    private String ten;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "mat_khau", nullable = false, length = 255)
    private String matKhau;

    @Column(name = "sdt", nullable = false, length = 15)
    private String sdt;

    @Column(name = "ngay_sinh", nullable = false)
    private LocalDate ngaySinh;

    @Column(name = "gioi_tinh", nullable = false)
    private Byte gioiTinh; // 0: Nam, 1: Nữ, 2: Khác

    @Column(name = "trang_thai", nullable = false)
    private Byte trangThai = 0; // 0: Hoạt động, 1: Khóa, 2: Nghỉ việc

    @Column(name = "ngay_bat_dau", nullable = false)
    private LocalDateTime ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private LocalDateTime ngayKetThuc;
}
