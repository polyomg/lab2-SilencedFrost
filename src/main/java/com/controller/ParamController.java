package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
    @RequestMapping("/param/form")
    public String form() {
        return "form";
    }
    @RequestMapping("/param/save/{x}")
    public String save(@RequestParam String x, @RequestParam String y, Model model) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "forward:/param/form";
    }
}
