package com.poly.main.B11_JPA2.repository;

import com.poly.main.B11_JPA2.entity.CaSi1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaSiRepository extends JpaRepository<CaSi1,Integer> {
}
