package com.lcx.tmall.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcx.tmall.pojo.Order;
import com.lcx.tmall.pojo.User;

public interface OrderDAO extends JpaRepository<Order,Integer>{
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}
