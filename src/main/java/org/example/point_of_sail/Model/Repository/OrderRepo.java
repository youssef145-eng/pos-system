package org.example.point_of_sail.Model.Repository;

import org.example.point_of_sail.Model.Repository.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity,Integer> {
}
