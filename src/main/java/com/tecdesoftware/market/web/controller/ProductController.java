package com.tecdesoftware.market.web.controller;


import com.tecdesoftware.market.domain.Product;
import com.tecdesoftware.market.domain.service.ProductService;
import com.tecdesoftware.market.persistance.ProductoRepository;
import com.tecdesoftware.market.persistance.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Le dice a Spring que va a hacer el controlador de una API REST
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductoRepository productoCrudRepository;


    // ──────────────────── GET /products  ALL ────────────────────
    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    // ───────────── GET /products/{id} (un solo producto) ─────────────

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") int productId) {
        return productService.getProduct(productId);
    }

    // ──────── GET /products/category/{id} (por categoría) ────────

    @GetMapping("/category/{id}")
    public Optional<List<Product>> getByCategory(@PathVariable("id") int categoryId) {
        return productService.getByCategory(categoryId);
    }

    // ──────────────────── POST /products ────────────────────

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    // ─────────────── DELETE /products/{id} ───────────────

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int productId) {
        return productService.delete(productId);

    }

}
