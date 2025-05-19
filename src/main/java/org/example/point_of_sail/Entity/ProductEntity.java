package org.example.point_of_sail.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "products")
@Data
public class ProductEntity {
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private double productPrice;
    @Column(name = "barcode")
    private String barcode;

    @OneToMany(mappedBy = "productEntity")
    @JsonBackReference
    private List<SaleEntity> saleEntity;
}
