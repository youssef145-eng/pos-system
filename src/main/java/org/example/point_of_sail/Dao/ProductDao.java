package org.example.point_of_sail.Dao;

import org.example.point_of_sail.Entity.ProductEntity;
import org.example.point_of_sail.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDao {

    @Autowired
    private ProductRepo productRepo;
   @Transactional     // the query must success all not half
    public ProductEntity addProduct(ProductEntity product) {

        return this.productRepo.save(product);
    }

    public String deleteProduct(Integer productId) {
        Optional<ProductEntity> product = this.productRepo.findById(productId);
        if (product.isPresent()) {
this.productRepo.deleteById(productId);
        return "Product deleted";
        }
        return "Product not found";
    }

    public String updateProduct(ProductEntity product) {
       Optional<ProductEntity> product1 = this.productRepo.findById(product.getProductId());
        if (product1.isPresent()) {
            this.productRepo.save(product);
            return "Product updated";
        }
        return "Product not found";
    }

public List<ProductEntity> getAllProducts() {
       return this.productRepo.findAll();
}

public ProductEntity getProductByBarcode(String Barcode) {
       return productRepo.findAllByBarcode(Barcode);
}
public ProductEntity getProductById(Integer productId) {
       return productRepo.findAllByProductId(productId);
}
}
