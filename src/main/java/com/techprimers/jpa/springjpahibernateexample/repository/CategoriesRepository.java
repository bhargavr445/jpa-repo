package com.techprimers.jpa.springjpahibernateexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techprimers.jpa.springjpahibernateexample.model.Categories;
@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer>{
 List<Categories> findAll();
}
