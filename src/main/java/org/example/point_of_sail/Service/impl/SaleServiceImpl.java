package org.example.point_of_sail.Service.impl;

import lombok.AllArgsConstructor;
import org.example.point_of_sail.Model.Repository.Dto.OrderDto;
import org.example.point_of_sail.Model.Repository.Entity.OrderEntity;
import org.example.point_of_sail.Model.Repository.Entity.SaleEntity;
import org.example.point_of_sail.Model.Repository.SaleRepo;
import org.example.point_of_sail.Service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepo saleRepo;
    @Autowired
    private OrderServiceImpl orderServiceImpl;

    public OrderEntity saveSale(List<OrderDto> order) {
        if (order.size() == 0)
            return null;

        OrderEntity orderEntity = this.orderServiceImpl.saveOrder(order);

        if (orderEntity.getOrderId() == 0) {
            throw new RuntimeException("Failed to save order, order ID is not generated.");
        }

        order.forEach(o -> {
            SaleEntity saleEntity = new SaleEntity();
            saleEntity.setProductId(o.getProductId());
            saleEntity.setOrderId(orderEntity.getOrderId());
            this.saleRepo.save(saleEntity);
        });

        return orderEntity;
    }
    public List<SaleEntity> getAllSales() {
        return this.saleRepo.findAll();
    }
    public List<SaleEntity> findSalesByOrderId(Integer orderId) {
        return this.saleRepo.findAByOrderId(orderId);
    }

}
