package com.poly.sof3021.B4_CRUDListFixCung.service;

import com.poly.sof3021.B4_CRUDListFixCung.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    private List<SinhVien> lists = new ArrayList<>();

    public SinhVienService() {
        // fake data
        lists.add(new SinhVien("hainv123", "Nguyen Van Hai", "Ha Noi", true, 24));
        lists.add(new SinhVien("hainv1234", "Nguyen Van Nam", "Ha Noi", true, 24));
        lists.add(new SinhVien("hainv1235", "Nguyen Van Vu", "Ha Noi", false, 24));
        lists.add(new SinhVien("hainv1236", "Nguyen Van Hoang", "Ha Noi", true, 24));
        lists.add(new SinhVien("hainv1237", "Nguyen Van Ha", "Ha Noi", true, 24));
    }

    public List<SinhVien> getAll() {
        return lists;
    }

    public void xoaSinhVien(String ma) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getMssv().equalsIgnoreCase(ma)) {
                lists.remove(i); // XOA DOI TUONG TIM THAY
            }
        }
    }

    public void addSinhVien(SinhVien sv) {
        lists.add(sv);
    }

    public SinhVien detailSinhVien(String ma) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getMssv().equalsIgnoreCase(ma)) {
                return lists.get(i);
            }
        }
        return null;
    }
}
