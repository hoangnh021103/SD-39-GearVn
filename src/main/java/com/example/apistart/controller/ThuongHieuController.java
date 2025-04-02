package com.example.apistart.controller;

import com.example.apistart.entity.ThuongHieu;
import com.example.apistart.service.ThuongHieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/thuonghieu")
public class ThuongHieuController {
    @Autowired
    private ThuongHieuService thuongHieuService;

    @GetMapping("/list")
    public String listThuongHieu(Model model) {
        List<ThuongHieu> thuongHieuList = thuongHieuService.getAll();
        model.addAttribute("thuongHieuList", thuongHieuList);
        return "thuonghieu/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("thuongHieu", new ThuongHieu());
        return "thuonghieu/form";
    }

    @PostMapping("/save")
    public String saveThuongHieu(@ModelAttribute ThuongHieu thuongHieu) {
        thuongHieuService.save(thuongHieu);
        return "redirect:/thuonghieu/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        ThuongHieu thuongHieu = thuongHieuService.getById(id);
        model.addAttribute("thuongHieu", thuongHieu);
        return "thuonghieu/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteThuongHieu(@PathVariable Integer id) {
        thuongHieuService.delete(id);
        return "redirect:/thuonghieu/list";
    }
}