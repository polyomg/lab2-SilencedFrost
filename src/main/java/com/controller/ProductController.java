package com.controller;

import com.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    protected List<Product> productList = new ArrayList<>();

    @RequestMapping("/product/form")
    public void form() {
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute Product product, Model model) {
        productList.add(product);
        model.addAttribute("name", product.getName());
        model.addAttribute("price", product.getPrice().toString());
        model.addAttribute("productList", productList);
        return "forward:/product/form";
    }
}
