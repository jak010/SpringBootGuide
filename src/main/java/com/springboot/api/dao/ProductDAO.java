package com.springboot.api.dao;

import com.springboot.api.entity.Product;
import com.springboot.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface ProductDAO {

    Product insertProduct(Product product);

    Product selectProduct(Long number);

    Product updateProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
