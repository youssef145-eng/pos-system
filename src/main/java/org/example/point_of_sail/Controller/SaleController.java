package org.example.point_of_sail.Controller;

import org.example.point_of_sail.Dao.SaleDao;
import org.example.point_of_sail.Entity.SaleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
@CrossOrigin
public class SaleController {


    @Autowired
    private SaleDao saleDao;
@GetMapping("/getAllSales")
    public List<SaleEntity> getAllSales() {
        return this.saleDao.getAllSales();
    }
@GetMapping("/findSalesByOrderId")
    public List<SaleEntity> findSalesByOrderId(@RequestParam Integer orderId) {
        return this.saleDao.findSalesByOrderId(orderId);
    }
}
