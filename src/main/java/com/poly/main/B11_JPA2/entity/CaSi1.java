package com.poly.main.B11_JPA2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ca_si")
public class CaSi1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_ca_si")
    private String tenCaSi;

    @Column(name = "que_quan")
    private String queQuan;

    @Column(name = "tuoi")
    private Integer tuoi;

    @Column(name = "cong_ty")
    private String tenCongTy;

    @Column(name = "sdt")
    private String soDienThoai;

    @Column(name = "gioi_tinh")
    private Boolean gioiTinh;

}
