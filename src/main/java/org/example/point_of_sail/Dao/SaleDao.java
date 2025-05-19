package org.example.point_of_sail.Dao;

import lombok.AllArgsConstructor;
import org.example.point_of_sail.Dto.OrderDto;
import org.example.point_of_sail.Entity.OrderEntity;
import org.example.point_of_sail.Entity.SaleEntity;
import org.example.point_of_sail.Repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class SaleDao {
    @Autowired
    private SaleRepo saleRepo;
    @Autowired
    private OrderDao orderDao;

    public OrderEntity saveSale(List<OrderDto> order) {
        if (order.size() == 0)
            return null;

        // حفظ order أولاً
        OrderEntity orderEntity = this.orderDao.saveOrder(order);

        // التأكد من أن orderEntity يحتوي على orderId الصحيح بعد الحفظ
        if (orderEntity.getOrderId() == 0) {
            throw new RuntimeException("Failed to save order, order ID is not generated.");
        }

        // حفظ SaleEntity بعد التأكد من أن orderEntity يحتوي على orderId الصحيح
        order.forEach(o -> {
            SaleEntity saleEntity = new SaleEntity();
            saleEntity.setProductId(o.getProductId());
            saleEntity.setOrderId(orderEntity.getOrderId()); // التأكد من تعيين orderId بشكل صحيح
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
