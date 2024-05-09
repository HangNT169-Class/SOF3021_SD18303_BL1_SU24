package com.poly.sof3021.B1_OverviewSping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// SPRING se nhan tat ca cac class/package => dat trong affiact la BEAN
// BE & FE trao doi thong qua tang o giua (controller)
@Controller
public class DemoController {

    // BE & FE trao thong qua phuong thuc HTTP
    // GET, POST, PUT, DELETE
    // J4 & J5: GET(Lay/ Hien thi) & POST(Xu ly)
    // MVC: TAT CA CAC HAM TRONG CONTROLLER => LUON LUON TRA VE 1 VIEW (RETURN STRING)

    @GetMapping("/xin-chao")
    public String hienThiGiaoDien(Model model){
        // Day gia tri tu controller -> jsp
        // J4: setAttribute
        // J5: addAttribute => Model : ui
        String mess = "Ahihi do ngoc";
        model.addAttribute("a1",mess);
        return "a";
    }

}
