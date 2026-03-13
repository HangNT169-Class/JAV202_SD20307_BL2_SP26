package com.poly.main.B3_LamViecVoiForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    // GET & POST:
    // GET: hien thi du lieu
    // POST: XU LY FORM(CAN CHE GIAU THONG TIN): add, update, login, dang ky....
    // TAT CA CAC HAM TRONG CLASS DUOC DANH DAU @CONTROLLER
    // LUON LUON TRA VE STRING (BAN CHAT LA 1 VIEW - GIAO DIEN)
    @GetMapping("login")
    public String hienThiFormLogin(Model m) {
        // truyen gia tri(servlet -> jsp)
        // J4: request.setAttribute
        // J5: Model.addAttribute => Model import .ui
        String test = "SD20307";
        m.addAttribute("name", test);
        return "test-buoi3"; // request.get..Dispatcher..
    }

    @PostMapping("ket-qua")
    public String xuLyFormLogin(
            // Lay gia tri cua o input
            @RequestParam("u1") String username,
            @RequestParam("p1") String password, Model m
    ) {
        m.addAttribute("username1", username);
        m.addAttribute("pass", password);
        return "ket-qua-form";
    }
}
