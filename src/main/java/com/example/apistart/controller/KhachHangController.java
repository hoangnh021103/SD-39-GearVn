package com.example.apistart.controller;

import com.example.apistart.entity.KhachHang;
import com.example.apistart.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/list")
    public String listKhachHang(Model model) {
        List<KhachHang> khachHangList = khachHangService.getAll();
        model.addAttribute("khachHangList", khachHangList);
        return "khachhang/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("khachHang", new KhachHang());
        return "khachhang/form";
    }

    @PostMapping("/save")
    public String saveKhachHang(@ModelAttribute KhachHang khachHang) {
        khachHangService.save(khachHang);
        return "redirect:/khachhang/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        KhachHang khachHang = khachHangService.getById(id);
        model.addAttribute("khachHang", khachHang);
        return "khachhang/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteKhachHang(@PathVariable Integer id) {
        khachHangService.delete(id);
        return "redirect:/khachhang/list";
    }
}