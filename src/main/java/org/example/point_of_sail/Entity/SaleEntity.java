package org.example.point_of_sail.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "sales")
@Data
public class SaleEntity {
    @Column(name = "sale_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int saleId;
    @Column(name = "product_id")
    private int productId;
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "created_at")
    private String createdAt;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity productEntity;
}
