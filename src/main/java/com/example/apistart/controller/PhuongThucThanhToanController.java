package com.example.apistart.controller;

import com.example.apistart.entity.PhuongThucThanhToan;
import com.example.apistart.service.PhuongThucThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/phuongthucthanhtoan")
public class PhuongThucThanhToanController {
    @Autowired
    private PhuongThucThanhToanService phuongThucThanhToanService;

    @GetMapping("/list")
    public String listPhuongThucThanhToan(Model model) {
        List<PhuongThucThanhToan> phuongThucThanhToanList = phuongThucThanhToanService.getAll();
        model.addAttribute("phuongThucThanhToanList", phuongThucThanhToanList);
        return "phuongthucthanhtoan/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("phuongThucThanhToan", new PhuongThucThanhToan());
        return "phuongthucthanhtoan/form";
    }

    @PostMapping("/save")
    public String savePhuongThucThanhToan(@ModelAttribute PhuongThucThanhToan phuongThucThanhToan) {
        phuongThucThanhToanService.save(phuongThucThanhToan);
        return "redirect:/phuongthucthanhtoan/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        PhuongThucThanhToan phuongThucThanhToan = phuongThucThanhToanService.getById(id);
        model.addAttribute("phuongThucThanhToan", phuongThucThanhToan);
        return "phuongthucthanhtoan/form";
    }

    @GetMapping("/delete/{id}")
    public String deletePhuongThucThanhToan(@PathVariable Integer id) {
        phuongThucThanhToanService.delete(id);
        return "redirect:/phuongthucthanhtoan/list";
    }
}