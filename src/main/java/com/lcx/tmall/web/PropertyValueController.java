package com.lcx.tmall.web;

import com.lcx.tmall.pojo.Product;
import com.lcx.tmall.pojo.PropertyValue;
import com.lcx.tmall.service.ProductService;
import com.lcx.tmall.service.PropertyValueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PropertyValueController {
    @Autowired
    PropertyValueService propertyValueService;
    @Autowired
    ProductService productService;

    @GetMapping("/products/{pid}/propertyValues")
    public List<PropertyValue> list(@PathVariable("pid") int pid)throws Exception {
        Product product = productService.get(pid);
        System.out.println("开始初始化属性");
        propertyValueService.init(product);
        System.out.println("chushihuawanbi");
        List<PropertyValue> propertyValues = propertyValueService.list(product);
        return propertyValues;

    }

    @PutMapping("/propertyValues")
    public Object update(@RequestBody PropertyValue bean) throws Exception{
        propertyValueService.update(bean);
        return bean;
    }
}