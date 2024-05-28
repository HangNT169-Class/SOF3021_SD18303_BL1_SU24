package com.poly.sof3021.B8_JPA.controller;

import com.poly.sof3021.B8_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    // goi ham repo
    @Autowired
    private CategoryRepository repo;

    @GetMapping("/hien-thi")
    public String hienThiDanhSach(Model model) {
        model.addAttribute("lists", repo.findAll()); // LAY TOAN BO DANH SACH
        // Add hoac update => save
//        repo.save(thuc the);
        // xoa
//        repo.delete(thuc the);
//        repo.deleteById(khoa chinh);
        // detail
        // Category1 cate = repo.findById(khoa chinh).get();
        return "";
    }
}
