package org.example.point_of_sail.Model.Repository;

import org.example.point_of_sail.Model.Repository.Entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepo extends JpaRepository<SaleEntity,Integer>{

    List<SaleEntity> findAByOrderId(Integer orderId );


}
