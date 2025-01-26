//package com.test.javabasic.controller;
//
//import com.test.javabasic.entity.ProductEntity;
//import com.test.javabasic.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/v1/api")
//public class ProductController {
//    @Autowired
//    private ProductService productService;
//
//    @PostMapping("/product/add")
//    public ProductEntity createProduct(ProductEntity product) {
//        return productService.createProduct(product);
//    }
//
//    @GetMapping("/product/getall")
//    public List<ProductEntity> getAllProducts() {
//        return productService.getAllProducts();
//    }
//}
