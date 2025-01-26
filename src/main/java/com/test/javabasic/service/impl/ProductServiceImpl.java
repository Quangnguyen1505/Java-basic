//package com.test.javabasic.service.impl;
//
//import com.test.javabasic.entity.ProductEntity;
//import com.test.javabasic.repository.ProductRepository;
//import com.test.javabasic.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductServiceImpl implements ProductService {
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Override
//    public ProductEntity createProduct(ProductEntity product) {
//        return productRepository.createProduct(product);
//    }
//
//    @Override
//    public List<ProductEntity> getAllProducts() {
//        return productRepository.getAllProducts();
//    }
//}
