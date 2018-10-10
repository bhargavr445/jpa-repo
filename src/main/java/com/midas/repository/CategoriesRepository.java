package com.midas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.midas.model.Categories;
@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer>{
 List<Categories> findAll();
}
