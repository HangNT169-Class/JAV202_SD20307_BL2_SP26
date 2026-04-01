package com.poly.main.B11_JPA2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "bai_hat")
public class BaiHat {
    // 1. MAPPING BANG K CO KHOA NGOAI TRUOC
    // 2. KHI MAPPING BANG CO KHOA NGOAI THI SE DE TRUONG KHOA NGOAI MAPPING CUOI CUNG

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_bai_hat")
    private String tenBaiHat;

    @Column(name = "ten_tac_gia")
    private String tenTacGia;

    @Column(name = "thoi_luong")
    private Integer thoiLuong;

    @Column(name = "ngay_san_xuat")
    private Date ngaySanXuat;

    @Column(name = "gia")
    private Float gia;

    @Column(name = "phat_hanh_dia")
    private Boolean phatHanhDia;

    @Column(name = "ngay_ra_mat")
    private Date ngayRaMat;

    // khoa ngoai nen mapping thanh doi tuong entity tuong ung
    @ManyToOne // them mqh vao day
    @JoinColumn(name = "ca_si_id") // ten cua cot
    private CaSi1 caSi1;

}
