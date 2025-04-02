package com.example.apistart.controller;

import com.example.apistart.entity.HinhAnh;
import com.example.apistart.service.HinhAnhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hinhanh")
public class HinhAnhController {
    @Autowired
    private HinhAnhService hinhAnhService;

    @GetMapping("/list")
    public String listHinhAnh(Model model) {
        List<HinhAnh> hinhAnhList = hinhAnhService.getAll();
        model.addAttribute("hinhAnhList", hinhAnhList);
        return "hinhanh/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("hinhAnh", new HinhAnh());
        return "hinhanh/form";
    }

    @PostMapping("/save")
    public String saveHinhAnh(@ModelAttribute HinhAnh hinhAnh) {
        hinhAnhService.save(hinhAnh);
        return "redirect:/hinhanh/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Byte id, Model model) {
        HinhAnh hinhAnh = hinhAnhService.getById(id);
        model.addAttribute("hinhAnh", hinhAnh);
        return "hinhanh/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteHinhAnh(@PathVariable Byte id) {
        hinhAnhService.delete(id);
        return "redirect:/hinhanh/list";
    }
}