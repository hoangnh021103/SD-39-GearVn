package com.example.apistart.controller;

import com.example.apistart.entity.DonViVanChuyen;
import com.example.apistart.service.DonViVanChuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/donvivanchuyen")
public class DonViVanChuyenController {
    @Autowired
    private DonViVanChuyenService donViVanChuyenService;

    @GetMapping("/list")
    public String listDonViVanChuyen(Model model) {
        List<DonViVanChuyen> donViVanChuyenList = donViVanChuyenService.getAll();
        model.addAttribute("donViVanChuyenList", donViVanChuyenList);
        return "donvivanchuyen/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("donViVanChuyen", new DonViVanChuyen());
        return "donvivanchuyen/form";
    }

    @PostMapping("/save")
    public String saveDonViVanChuyen(@ModelAttribute DonViVanChuyen donViVanChuyen) {
        donViVanChuyenService.save(donViVanChuyen);
        return "redirect:/donvivanchuyen/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        DonViVanChuyen donViVanChuyen = donViVanChuyenService.getById(id);
        model.addAttribute("donViVanChuyen", donViVanChuyen);
        return "donvivanchuyen/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteDonViVanChuyen(@PathVariable Integer id) {
        donViVanChuyenService.delete(id);
        return "redirect:/donvivanchuyen/list";
    }
}