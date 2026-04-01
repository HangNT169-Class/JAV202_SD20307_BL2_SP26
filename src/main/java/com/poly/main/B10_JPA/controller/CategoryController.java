package com.poly.main.B10_JPA.controller;

import com.poly.main.B10_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    // Moi thu trong controller giong y si list fix cung

    @Autowired
    private CategoryRepository cateRepository;

    @GetMapping("category/hien-thi")
    public String hienThiDanhSachCate(Model m) {
        m.addAttribute("lists", cateRepository.findAll());
        return "cate";
    }
    // 1. Ghi not controller
    // 2. Viet load table ben html
    // 3. Chay hien thi
    // 10:45 kiem tra
}
