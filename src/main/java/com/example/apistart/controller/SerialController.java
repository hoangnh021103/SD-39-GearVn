package com.example.apistart.controller;

import com.example.apistart.entity.Serial;
import com.example.apistart.service.SerialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/serial")
public class SerialController {
    @Autowired
    private SerialService serialService;

    @GetMapping("/list")
    public String listSerial(Model model) {
        List<Serial> serialList = serialService.getAll();
        model.addAttribute("serialList", serialList);
        return "serial/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("serial", new Serial());
        return "serial/form";
    }

    @PostMapping("/save")
    public String saveSerial(@ModelAttribute Serial serial) {
        serialService.save(serial);
        return "redirect:/serial/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Serial serial = serialService.getById(id);
        model.addAttribute("serial", serial);
        return "serial/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteSerial(@PathVariable Integer id) {
        serialService.delete(id);
        return "redirect:/serial/list";
    }
}