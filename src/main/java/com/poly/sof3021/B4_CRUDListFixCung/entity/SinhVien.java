package com.poly.sof3021.B4_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Tao controller tuy y
@ToString
// import *
public class SinhVien {

    private String mssv;

    private String ten;

    private String diaChi;

    private Boolean gioiTinh;

    private Integer tuoi;

}
