package com.example.apistart.controller;

import com.example.apistart.entity.HoaDon;
import com.example.apistart.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hoadon")
public class HoaDonController {
    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping("/list")
    public String listHoaDon(Model model) {
        List<HoaDon> hoaDonList = hoaDonService.getAll();
        model.addAttribute("hoaDonList", hoaDonList);
        return "hoadon/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("hoaDon", new HoaDon());
        return "hoadon/form";
    }

    @PostMapping("/save")
    public String saveHoaDon(@ModelAttribute HoaDon hoaDon) {
        hoaDonService.save(hoaDon);
        return "redirect:/hoadon/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        HoaDon hoaDon = hoaDonService.getById(id);
        model.addAttribute("hoaDon", hoaDon);
        return "hoadon/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteHoaDon(@PathVariable Integer id) {
        hoaDonService.delete(id);
        return "redirect:/hoadon/list";
    }
}