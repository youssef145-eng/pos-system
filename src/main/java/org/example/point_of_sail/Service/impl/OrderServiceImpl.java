package org.example.point_of_sail.Service.impl;

import org.example.point_of_sail.Model.Repository.Dto.OrderDto;
import org.example.point_of_sail.Model.Repository.Entity.OrderEntity;
import org.example.point_of_sail.Model.Repository.OrderRepo;
import org.example.point_of_sail.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepo orderRepo;
private OrderServiceImpl orderServiceImpl;

    public OrderEntity saveOrder(List<OrderDto> order) {
Double total = 0.0;
for(OrderDto orderDto : order) {
    total +=orderDto.getProductPrice();
}
OrderEntity orderEntity = new OrderEntity();
        orderEntity.setTotal(total);
return orderRepo.save(orderEntity);

    }

    public List<OrderEntity> getAllOrders() {
        return orderRepo.findAll();
    }

}
