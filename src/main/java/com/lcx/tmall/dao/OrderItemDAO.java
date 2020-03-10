package com.lcx.tmall.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcx.tmall.pojo.Order;
import com.lcx.tmall.pojo.OrderItem;
import com.lcx.tmall.pojo.Product;
import com.lcx.tmall.pojo.User;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    List<OrderItem> findByProduct(Product product);
    List<OrderItem> findByUserAndOrderIsNull(User user);
}