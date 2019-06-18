package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Orders;

@Repository
public interface IOrderDao extends JpaRepository<Orders, Integer>{

}
