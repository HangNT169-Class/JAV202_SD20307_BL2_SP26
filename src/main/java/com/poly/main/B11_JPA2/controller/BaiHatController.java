package com.poly.main.B11_JPA2.controller;

import com.poly.main.B11_JPA2.entity.BaiHat;
import com.poly.main.B11_JPA2.repository.BaiHatRepository;
import com.poly.main.B11_JPA2.repository.CaSiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BaiHatController {

    @Autowired
    private BaiHatRepository baiHatRepository;

    @Autowired
    private CaSiRepository caSiRepository;

    @GetMapping("bai-hat/hien-thi")
    public String hienThiDanhSachBaiHat(Model m) {
        m.addAttribute("listCaSi", caSiRepository.findAll());
        m.addAttribute("listBai", baiHatRepository.findAll());
        return "buoi11/bai-hat";
    }

//    const lists = ref(
//            [
//    {
//
//    }]
//    )
    // GS k tra ve String
    @GetMapping("bai-hat/hien-thi1")
    @ResponseBody // o trong controller khi muon tra ra dinh dang json
    public List<BaiHat> hienThiDanhSachBaiHat1() {
        return baiHatRepository.findAll();
    }

    // phan trang cung dung ham co san: Page
    @GetMapping("bai-hat/phan-trang")
    @ResponseBody // o trong controller khi muon tra ra dinh dang json
    public Page<BaiHat> phanTrang(@RequestParam("pageNo")Integer pageNo,
                                  @RequestParam("pageSize") Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return baiHatRepository.findAll(pageable); // cung dung findAll cho phan trang
    }
}
