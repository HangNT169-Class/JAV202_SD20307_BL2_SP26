package com.poly.main.B4_5_CRUDListFixCung.service;

import com.poly.main.B4_5_CRUDListFixCung.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService {

    //  chua cac ham ma de bai yeu cau
    // it nhat 6 ham
    private List<SinhVien> listSinhVien = new ArrayList<>();

    // Ctrl Alt O => xoa import thua
    // Ctrl Alt L => format code
    public SinhVienService() {
        // add cac phan tu vao list
        listSinhVien.add(new SinhVien("SV01", "Nguyen Van A", 10, "Ha noi", true));
        listSinhVien.add(new SinhVien("SV02", "Nguyen Ngoc B", 15, "Thai Binh", false));
        listSinhVien.add(new SinhVien("SV03", "Nguyen Van C", 25, "Vinh Phuc", false));
        listSinhVien.add(new SinhVien("SV04", "Tran Van A", 8, "Nam Dinh", true));
        listSinhVien.add(new SinhVien("SV05", "Tran Van B", 30, "Ha Nam", false));
    }

    // chuc nang 1 => hien thi du lieu
    public List<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    // ham
    public void addSinhVien(SinhVien sv) {
        listSinhVien.add(sv);
    }

    public void removeSinhVien(String mssv) {
        // cu phap dung remove if: Xoa theo dk
        listSinhVien.removeIf(s -> s.getMssv().equalsIgnoreCase(mssv));
    }

    public SinhVien detailSinhVien(String mssv) {
        return listSinhVien.stream()
                .filter(s -> s.getMssv().equalsIgnoreCase(mssv))
                .findFirst()
                .orElse(null);
    }
}

