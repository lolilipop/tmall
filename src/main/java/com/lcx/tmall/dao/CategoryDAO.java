package com.lcx.tmall.dao;

import com.lcx.tmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
//Integer 指的是id类型
public interface CategoryDAO extends JpaRepository<Category,Integer>{
}
