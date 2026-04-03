package com.poly.main.B4_5_CRUDListFixCung.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SinhVien {

    // Cac truong nao => Spring Validation
//    "" "        " => Not empty
    @NotBlank(message = "Ma SV k duoc trong")
    private String mssv;

    @NotBlank(message = "Ten SV k duoc trong")
    private String ten;

    // So thi dung not null
    @NotNull(message = "Tuoi k duoc trong")
//    @Min(value = 5,message = "Tuoi phai lon hon 5")
//    @Max(value = 20,message = "Tuoi phai nho hon 20")
    private Integer tuoi;

    @NotBlank(message = "Dia chi k duoc trong")
    private String diaChi;

    private Boolean gioiTinh;

}
