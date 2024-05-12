package com.poly.sof3021.B3_Request_Validate.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DangKyRequest {

    private String ten;

    private Integer tuoi;

    private String nganhHoc;

    private String queQuan;

    private String matKhau;

    private String confirmMatKhau;

}
