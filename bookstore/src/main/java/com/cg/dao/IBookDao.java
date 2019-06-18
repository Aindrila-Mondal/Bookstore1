package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Book;

@Repository
public interface IBookDao extends JpaRepository<Book, Integer> {

}
