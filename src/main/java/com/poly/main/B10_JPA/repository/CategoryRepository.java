package com.poly.main.B10_JPA.repository;

import com.poly.main.B10_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // danh dau tang day la repo
public interface CategoryRepository extends JpaRepository<Category1, Long> {
    // TS1: Doi tuong CRUD - ten CLASS trong ENTITY
    // TS2: Kieu du lieu cua khoa chinh - CHI CHAP NHAN KIEU OBJECT
    // - CHU CAI DAU VIET HOA
    // CRUD 1 BANG K CAN PHAI VIET
    // Hien thi => findAll()
    // add hoac update => save(doi tuong)
    // detail => findById(khoa chinh)
    // xoa => deleteById(khoa chinh)

    // custom SQL
    // 1. JPQL - JPA Query Language => HQL => Truy van tren thuc the (Class): k co select *
//    @Query("""
//            SELECT c FROM Category1 c
//            WHERE c.categoryName = ?2 AND c.categoryCode = ?1
//            """)
//    List<Category1> timKiemTheoTen(String code, String ten);
//    // 2. native query => Truy van tren SQL server => co the select *
//    @Query(value = """
//            SELECT * FROM category WHERE category_name = ?1
//            """, nativeQuery = true)
//    List<Category1> timKiemTheoTen1(String ten);

}
