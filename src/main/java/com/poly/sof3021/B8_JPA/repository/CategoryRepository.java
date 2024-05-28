package com.poly.sof3021.B8_JPA.repository;

import com.poly.sof3021.B8_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category1, Long> {

    // extends : CRUDRepository/JpaRepository
    // CRUD 1 bang/phan trang => k can phai viet
    // C1: Query creation
    // Category1 findCategory1ById1AndCategoryCode1(Long id, String code);
    // C2: Raw SQL
    // C2.1: Truy van thuc the  JPQL - JPA Query Language
    @Query(" SELECT c FROM Category1 c WHERE c.id1 = ?2 AND c.categoryCode1 =?1")
    List<Category1>search(String code, Long id);
    // C2.2:  Truy van SQL : native query
//    @Query(value = "SELECT * FROM category where id = ?2 and category_code =?1",nativeQuery = true)
//    List<Category1> sgdfgdf(String code, Long id); // interface
}
