package org.example.point_of_sail.Repository;

import org.example.point_of_sail.Entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepo extends JpaRepository<SaleEntity,Integer>{

    List<SaleEntity> findAByOrderId(Integer orderId );


}
