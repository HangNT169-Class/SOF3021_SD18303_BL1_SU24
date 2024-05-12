package com.poly.sof3021.B3_Request_Validate.controller;

import com.poly.sof3021.B3_Request_Validate.request.DangKyRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DangKyController {
    @GetMapping("/dang-ky")
    public String dangKy(){
        return "buoi3/dangKy";
    }

    // Convention : Tham so toi da cua 1 ham la 3
    // yeu cau => request
    @PostMapping("/home")
    public String hienThi(DangKyRequest request,
                          Model model){
        model.addAttribute("hoTen",request.getTen());
        model.addAttribute("tuoi",request.getTuoi());
        model.addAttribute("nganhHoc",request.getNganhHoc());
        model.addAttribute("quequan",request.getQueQuan());
        model.addAttribute("matkhau",request.getMatKhau());
        model.addAttribute("confirmmatkhau",request.getConfirmMatKhau());
        return "buoi3/hienThi";
    }

}
