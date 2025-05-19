package org.example.point_of_sail.Controller;

import org.example.point_of_sail.Dao.OrderDao;
import org.example.point_of_sail.Dao.SaleDao;
import org.example.point_of_sail.Dto.OrderDto;
import org.example.point_of_sail.Entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderDao orderDao;

@Autowired
private SaleDao saleDao;
    // product ID and  price
@PostMapping("/save-order")
    public OrderEntity saveOrder(@RequestBody List<OrderDto>order) {
        return saleDao.saveSale(order);
    }

    @GetMapping("/getAllOrders")
    public List<OrderEntity> getAllOrders() {
    return orderDao.getAllOrders();
    }

}
