package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Category;

@Repository
public interface ICategoryDao extends JpaRepository<Category, Integer> {

}
