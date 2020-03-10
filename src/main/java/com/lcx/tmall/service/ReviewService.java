package com.lcx.tmall.service;

import com.lcx.tmall.dao.ReviewDAO;
import com.lcx.tmall.pojo.Product;
import com.lcx.tmall.pojo.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    ReviewDAO reviewDAO;
    @Autowired
    ProductService productService;

    public void add(Review review){
        reviewDAO.save(review);
    }

    public List<Review> list(Product product){
        return reviewDAO.findByProductOrderByIdDesc(product);
    }

    public int getCount(Product product){
        return reviewDAO.countByProduct(product);
    }
}
