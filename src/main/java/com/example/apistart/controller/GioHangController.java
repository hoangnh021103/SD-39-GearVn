package com.example.apistart.controller;

import com.example.apistart.entity.GioHang;
import com.example.apistart.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/giohang")
public class GioHangController {
    @Autowired
    private GioHangService gioHangService;

    @GetMapping("/list")
    public String listGioHang(Model model) {
        List<GioHang> gioHangList = gioHangService.getAll();
        model.addAttribute("gioHangList", gioHangList);
        return "giohang/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("gioHang", new GioHang());
        return "giohang/form";
    }

    @PostMapping("/save")
    public String saveGioHang(@ModelAttribute GioHang gioHang) {
        gioHangService.save(gioHang);
        return "redirect:/giohang/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        GioHang gioHang = gioHangService.getById(id);
        model.addAttribute("gioHang", gioHang);
        return "giohang/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteGioHang(@PathVariable Integer id) {
        gioHangService.delete(id);
        return "redirect:/giohang/list";
    }
}