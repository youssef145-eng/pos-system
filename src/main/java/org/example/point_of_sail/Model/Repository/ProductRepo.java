package org.example.point_of_sail.Model.Repository;

import org.example.point_of_sail.Model.Repository.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {

    ProductEntity findAllByBarcode(String barcode);
    ProductEntity findAllByProductId(Integer productId);
}
