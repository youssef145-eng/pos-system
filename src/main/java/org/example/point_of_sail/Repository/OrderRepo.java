package org.example.point_of_sail.Repository;

import org.example.point_of_sail.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity,Integer> {
}
