package com.poly.main.B4_5_CRUDListFixCung.controller;

import com.poly.main.B4_5_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {

    // Goi service
    @Autowired // k them Autowired => doi tuong bi null
    private SinhVienService sinhVienService;

//    @Autowired
//    private DongVatService dongVatService;

    @GetMapping("sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model m) {
        m.addAttribute("lists", sinhVienService.getListSinhVien());
        return "buoi4/sinh-viens";
    }

}
