package com.poly.main.B11_JPA2.repository;

import com.poly.main.B11_JPA2.entity.BaiHat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiHatRepository extends JpaRepository<BaiHat,Integer> {
}
