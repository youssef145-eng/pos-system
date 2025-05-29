package org.example.point_of_sail.Service;

import org.example.point_of_sail.Model.Repository.Dto.OrderDto;
import org.example.point_of_sail.Model.Repository.Entity.OrderEntity;

import java.util.List;

public interface OrderService {

    public OrderEntity saveOrder(List<OrderDto> order) ;
    public List<OrderEntity> getAllOrders() ;
}
