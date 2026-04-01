package com.poly.main.B11_JPA2.controller;

import com.poly.main.B11_JPA2.entity.BaiHat;
import com.poly.main.B11_JPA2.repository.BaiHatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaiHat1Controller {

    @Autowired
    private BaiHatRepository baiHatRepository;

    @GetMapping("bai-hat/hien-thi12")
    public List<BaiHat> hienThiDanhSachBaiHat1() {
        return baiHatRepository.findAll();
    }
}
