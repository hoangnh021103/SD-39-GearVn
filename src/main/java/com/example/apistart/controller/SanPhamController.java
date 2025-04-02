package com.example.apistart.controller;

import com.example.apistart.entity.SanPham;
import com.example.apistart.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("/list")
    public String listSanPham(Model model) {
        List<SanPham> sanPhamList = sanPhamService.getAll();
        model.addAttribute("sanPhamList", sanPhamList);
        return "sanpham/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("sanPham", new SanPham());
        return "sanpham/form";
    }

    @PostMapping("/save")
    public String saveSanPham(@ModelAttribute SanPham sanPham) {
        sanPhamService.save(sanPham);
        return "redirect:/sanpham/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        SanPham sanPham = sanPhamService.getById(id);
        model.addAttribute("sanPham", sanPham);
        return "sanpham/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteSanPham(@PathVariable Integer id) {
        sanPhamService.delete(id);
        return "redirect:/sanpham/list";
    }
}