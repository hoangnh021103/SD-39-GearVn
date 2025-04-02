package com.example.apistart.controller;

import com.example.apistart.entity.ChiTietHoaDon;
import com.example.apistart.service.ChiTietHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chitiethoadon")
public class ChiTietHoaDonController {
    @Autowired
    private ChiTietHoaDonService chiTietHoaDonService;

    @GetMapping("/list")
    public String listChiTietHoaDon(Model model) {
        List<ChiTietHoaDon> chiTietHoaDonList = chiTietHoaDonService.getAll();
        model.addAttribute("chiTietHoaDonList", chiTietHoaDonList);
        return "chitiethoadon/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("chiTietHoaDon", new ChiTietHoaDon());
        return "chitiethoadon/form";
    }

    @PostMapping("/save")
    public String saveChiTietHoaDon(@ModelAttribute ChiTietHoaDon chiTietHoaDon) {
        chiTietHoaDonService.save(chiTietHoaDon);
        return "redirect:/chitiethoadon/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        ChiTietHoaDon chiTietHoaDon = chiTietHoaDonService.getById(id);
        model.addAttribute("chiTietHoaDon", chiTietHoaDon);
        return "chitiethoadon/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteChiTietHoaDon(@PathVariable Integer id) {
        chiTietHoaDonService.delete(id);
        return "redirect:/chitiethoadon/list";
    }
}