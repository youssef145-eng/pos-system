package org.example.point_of_sail.Dao;

import org.example.point_of_sail.Dto.OrderDto;
import org.example.point_of_sail.Entity.OrderEntity;
import org.example.point_of_sail.Entity.ProductEntity;
import org.example.point_of_sail.Repository.OrderRepo;
import org.example.point_of_sail.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDao {
    @Autowired
    private OrderRepo orderRepo;
private OrderDao orderDao;

    public OrderEntity saveOrder(List<OrderDto> order) {
Double total = 0.0;
for(OrderDto orderDto : order) {
    total +=orderDto.getProductPrice();
}
OrderEntity orderEntity = new OrderEntity();
        orderEntity.setTotal(total); // ← حل المشكلة هنا
return orderRepo.save(orderEntity);

    }

    public List<OrderEntity> getAllOrders() {
        return orderRepo.findAll();
    }

}
