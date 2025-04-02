package com.example.apistart.controller;

import com.example.apistart.entity.GioHangSpct;
import com.example.apistart.service.GioHangSpctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/giohangspct")
public class GioHangSpctController {
    @Autowired
    private GioHangSpctService gioHangSpctService;

    @GetMapping("/list")
    public String listGioHangSpct(Model model) {
        List<GioHangSpct> gioHangSpctList = gioHangSpctService.getAll();
        model.addAttribute("gioHangSpctList", gioHangSpctList);
        return "giohangspct/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("gioHangSpct", new GioHangSpct());
        return "giohangspct/form";
    }

    @PostMapping("/save")
    public String saveGioHangSpct(@ModelAttribute GioHangSpct gioHangSpct) {
        gioHangSpctService.save(gioHangSpct);
        return "redirect:/giohangspct/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        GioHangSpct gioHangSpct = gioHangSpctService.getById(id);
        model.addAttribute("gioHangSpct", gioHangSpct);
        return "giohangspct/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteGioHangSpct(@PathVariable Integer id) {
        gioHangSpctService.delete(id);
        return "redirect:/giohangspct/list";
    }
}