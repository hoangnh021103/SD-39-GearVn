package com.example.apistart.controller;

import com.example.apistart.entity.NhanVien;
import com.example.apistart.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/list")
    public String listNhanVien(Model model) {
        List<NhanVien> nhanVienList = nhanVienService.getAll();
        model.addAttribute("nhanVienList", nhanVienList);
        return "nhanvien/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        return "nhanvien/form";
    }

    @PostMapping("/save")
    public String saveNhanVien(@ModelAttribute NhanVien nhanVien) {
        nhanVienService.save(nhanVien);
        return "redirect:/nhanvien/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        NhanVien nhanVien = nhanVienService.getById(id);
        model.addAttribute("nhanVien", nhanVien);
        return "nhanvien/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteNhanVien(@PathVariable Integer id) {
        nhanVienService.delete(id);
        return "redirect:/nhanvien/list";
    }
}