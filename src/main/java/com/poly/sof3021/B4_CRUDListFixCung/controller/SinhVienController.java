package com.poly.sof3021.B4_CRUDListFixCung.controller;

import com.poly.sof3021.B4_CRUDListFixCung.service.SinhVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SinhVienController {

    private SinhVienService service = new SinhVienService();

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model model){
        model.addAttribute("a",service.getAll());
        return "buoi4/sinhviens";
    }

    @GetMapping("/sinh-vien/remove/{maSinhVien}")
    public String xoaSinhVien(@PathVariable("maSinhVien")String ma){
        service.xoaSinhVien(ma);
        return "redirect:/sinh-vien/hien-thi"; // CHUYEN TRANG REDIRECT
    }
}
