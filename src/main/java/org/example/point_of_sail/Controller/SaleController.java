package org.example.point_of_sail.Controller;

import org.example.point_of_sail.Service.impl.SaleServiceImpl;
import org.example.point_of_sail.Model.Repository.Entity.SaleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
@CrossOrigin
public class SaleController {


    @Autowired
    private SaleServiceImpl saleServiceImpl;
@GetMapping("/getAllSales")
    public List<SaleEntity> getAllSales() {
        return this.saleServiceImpl.getAllSales();
    }
@GetMapping("/findSalesByOrderId")
    public List<SaleEntity> findSalesByOrderId(@RequestParam Integer orderId) {
        return this.saleServiceImpl.findSalesByOrderId(orderId);
    }
}
