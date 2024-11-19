package com.example.Security6.ldmv.service;

import com.example.Security6.ldmv.entity.Product;

import java.util.List;

public interface ProductServices {
    void delete(Long id);
    Product get(Long id);
    Product save(Product product);
    List<Product> listAll();
}
