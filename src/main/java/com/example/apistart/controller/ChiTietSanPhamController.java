package com.example.apistart.controller;

import com.example.apistart.entity.ChiTietSanPham;
import com.example.apistart.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chitietsanpham")
public class ChiTietSanPhamController {
    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    @GetMapping("/list")
    public String listChiTietSanPham(Model model) {
        List<ChiTietSanPham> chiTietSanPhamList = chiTietSanPhamService.getAll();
        model.addAttribute("chiTietSanPhamList", chiTietSanPhamList);
        return "chitietsanpham/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("chiTietSanPham", new ChiTietSanPham());
        return "chitietsanpham/form";
    }

    @PostMapping("/save")
    public String saveChiTietSanPham(@ModelAttribute ChiTietSanPham chiTietSanPham) {
        chiTietSanPhamService.save(chiTietSanPham);
        return "redirect:/chitietsanpham/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        ChiTietSanPham chiTietSanPham = chiTietSanPhamService.getById(id);
        model.addAttribute("chiTietSanPham", chiTietSanPham);
        return "chitietsanpham/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteChiTietSanPham(@PathVariable Integer id) {
        chiTietSanPhamService.delete(id);
        return "redirect:/chitietsanpham/list";
    }
}