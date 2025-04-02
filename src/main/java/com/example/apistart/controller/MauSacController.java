package com.example.apistart.controller;

import com.example.apistart.entity.MauSac;
import com.example.apistart.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/mausac")
public class MauSacController {
    @Autowired
    private MauSacService mauSacService;

    @GetMapping("/list")
    public String listMauSac(Model model) {
        List<MauSac> mauSacList = mauSacService.getAll();
        model.addAttribute("mauSacList", mauSacList);
        return "mausac/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("mauSac", new MauSac());
        return "mausac/form";
    }

    @PostMapping("/save")
    public String saveMauSac(@ModelAttribute MauSac mauSac) {
        mauSacService.save(mauSac);
        return "redirect:/mausac/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Byte id, Model model) {
        MauSac mauSac = mauSacService.getById(id);
        model.addAttribute("mauSac", mauSac);
        return "mausac/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteMauSac(@PathVariable Byte id) {
        mauSacService.delete(id);
        return "redirect:/mausac/list";
    }
}