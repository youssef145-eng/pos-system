package org.example.point_of_sail.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "total")
    private Double total;
}
