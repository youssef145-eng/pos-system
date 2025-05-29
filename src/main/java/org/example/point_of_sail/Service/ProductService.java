package org.example.point_of_sail.Service;

import org.example.point_of_sail.Model.Repository.Entity.ProductEntity;

import java.util.List;

public interface ProductService {
    ProductEntity addProduct(ProductEntity product);
    String deleteProduct(Integer productId);
    String updateProduct(ProductEntity product);
    List<ProductEntity> getAllProducts();
    ProductEntity getProductByBarcode(String barcode);
    ProductEntity getProductById(Integer productId);
}
