package org.example.point_of_sail.Repository;

import org.example.point_of_sail.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {

    ProductEntity findAllByBarcode(String barcode);
    ProductEntity findAllByProductId(Integer productId);
}
