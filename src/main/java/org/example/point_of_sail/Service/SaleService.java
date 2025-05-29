package org.example.point_of_sail.Service;

import org.example.point_of_sail.Model.Repository.Dto.OrderDto;
import org.example.point_of_sail.Model.Repository.Entity.OrderEntity;
import org.example.point_of_sail.Model.Repository.Entity.SaleEntity;

import java.util.List;

public interface SaleService {
    public OrderEntity saveSale(List<OrderDto> order) ;
    public List<SaleEntity> getAllSales();
    public List<SaleEntity> findSalesByOrderId(Integer orderId) ;

}
