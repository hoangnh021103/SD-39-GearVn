package com.example.apistart.controller;

import com.example.apistart.entity.TaiKhoan;
import com.example.apistart.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/taikhoan")
public class TaiKhoanController {
    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping("/list")
    public String listTaiKhoan(Model model) {
        List<TaiKhoan> taiKhoanList = taiKhoanService.getAll();
        model.addAttribute("taiKhoanList", taiKhoanList);
        return "taikhoan/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("taiKhoan", new TaiKhoan());
        return "taikhoan/form";
    }

    @PostMapping("/save")
    public String saveTaiKhoan(@ModelAttribute TaiKhoan taiKhoan) {
        taiKhoanService.save(taiKhoan);
        return "redirect:/taikhoan/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        TaiKhoan taiKhoan = taiKhoanService.getById(id);
        model.addAttribute("taiKhoan", taiKhoan);
        return "taikhoan/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteTaiKhoan(@PathVariable Integer id) {
        taiKhoanService.delete(id);
        return "redirect:/taikhoan/list";
    }
}