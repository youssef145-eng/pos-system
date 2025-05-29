package org.example.point_of_sail.Controller;

import org.example.point_of_sail.Service.impl.OrderServiceImpl;
import org.example.point_of_sail.Service.impl.SaleServiceImpl;
import org.example.point_of_sail.Model.Repository.Dto.OrderDto;
import org.example.point_of_sail.Model.Repository.Entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderServiceImpl orderServiceImpl;

@Autowired
private SaleServiceImpl saleServiceImpl;
    // product ID and  price
@PostMapping("/save-order")
    public OrderEntity saveOrder(@RequestBody List<OrderDto>order) {
        return saleServiceImpl.saveSale(order);
    }

    @GetMapping("/getAllOrders")
    public List<OrderEntity> getAllOrders() {
    return orderServiceImpl.getAllOrders();
    }

}
