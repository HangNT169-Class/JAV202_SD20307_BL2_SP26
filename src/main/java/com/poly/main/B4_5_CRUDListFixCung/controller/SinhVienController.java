package com.poly.main.B4_5_CRUDListFixCung.controller;

import com.poly.main.B4_5_CRUDListFixCung.entity.SinhVien;
import com.poly.main.B4_5_CRUDListFixCung.service.SinhVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sinh-vien/")
// tach duong dan chung
public class SinhVienController {

    // Goi service
    @Autowired // k them Autowired => doi tuong bi null
    private SinhVienService sinhVienService;

//    @Autowired
//    private DongVatService dongVatService;

    // sinh-vien/hien-thi
    @GetMapping("hien-thi")
    public String hienThiDanhSachSinhVien(Model m) {
        m.addAttribute("lists", sinhVienService.getListSinhVien());
        return "buoi4/sinh-viens";
    }

    @GetMapping("delete/{ma1}")
    public String xoaSinhVien(@PathVariable("ma1") String ma) {
        sinhVienService.removeSinhVien(ma);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("detail/{a}")
    public String detailSinhVien(@PathVariable("a") String mssv, Model m) {
        SinhVien sv = sinhVienService.detailSinhVien(mssv);
        m.addAttribute("sv1", sv);
        return "buoi4/update-sinh-vien";
    }

    // Bam vao button Add thi chuyen sang trang Add
    @GetMapping("view-add")
    public String hienThiFormAdd(Model m) {
        // Tao 1 object sv rong de truyen sang thymeaft sinh-viens
        // phuc vu cho ham validate
        m.addAttribute("sv", new SinhVien());
        return "buoi4/add-sinh-vien";
    }

    // Binding Result phai được đặt ngay sau đối tượng cần validate
    @PostMapping("add")
    public String addSinhVien(@Valid @ModelAttribute("sv") SinhVien sv,
                              BindingResult result) {
        if (result.hasErrors()) {
            return "buoi4/add-sinh-vien";
        }
        sinhVienService.addSinhVien(sv);
        return "redirect:/sinh-vien/hien-thi";
    }
//    @PostMapping("add")
//    public String addSinhVien(SinhVien sv) {
//        sinhVienService.addSinhVien(sv);
//        return "redirect:/sinh-vien/hien-thi";
//    }
}
