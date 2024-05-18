package com.poly.sof3021.B4_CRUDListFixCung.controller;

import com.poly.sof3021.B4_CRUDListFixCung.entity.SinhVien;
import com.poly.sof3021.B4_CRUDListFixCung.service.SinhVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sinh-vien/") // PHAN CHUNG CUA TAT CA CAC DUONG DAN
public class SinhVienController {

    private SinhVienService service = new SinhVienService();

    @GetMapping("hien-thi")
//    @RequestMapping(value = "hien-thi",method = RequestMethod.POST)
    public String hienThiDanhSachSinhVien(Model model) {
        model.addAttribute("a", service.getAll());
        return "buoi4/sinhviens";
    }

    @GetMapping("remove/{maSinhVien}")
    public String xoaSinhVien(@PathVariable("maSinhVien") String ma) {
        service.xoaSinhVien(ma);
        return "redirect:/sinh-vien/hien-thi"; // CHUYEN TRANG REDIRECT
    }

    @GetMapping("view-add")
    public String hienThiAdd() {
        return "buoi4/add-sinh-vien";
    }

    @PostMapping("add")
    public String addSinhVien(SinhVien sv) {
        service.addSinhVien(sv);
        return "redirect:/sinh-vien/hien-thi"; // CHUYEN TRANG REDIRECT
    }

    @GetMapping("detail/{ma1}")
    public String detail(@PathVariable("ma1") String ma1, Model model) {
        SinhVien sv = service.detailSinhVien(ma1);
        model.addAttribute("sv1", sv);
        return "buoi4/detail-sinh-vien";
    }

    @GetMapping("view-update/{ma1}")
    public String viewUpdate(@PathVariable("ma1") String ma1, Model model) {
        SinhVien sv = service.detailSinhVien(ma1);
        model.addAttribute("sv1", sv);
        return "buoi4/update-sinh-vien";
    }
}
