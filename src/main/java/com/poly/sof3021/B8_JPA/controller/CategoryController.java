package com.poly.sof3021.B8_JPA.controller;

import com.poly.sof3021.B8_JPA.entity.Category1;
import com.poly.sof3021.B8_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
// Co 2 cach danh dau tang controller
// 1. Controller
// 2. RestController => api : String, List, Optional...
// api: json/xml
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
//        Category1 cate = repo.findById(1L).get();
        return "";
    }

    @GetMapping("/aaa")
    @ResponseBody // muon tra ra api
    public List<Category1>getAll(){
        // phan trang : Page -> import domain
        return repo.findAll();
    }

    @GetMapping("a1")
    @ResponseBody
    public String test(){
        return "a";
    }
}
