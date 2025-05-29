package org.example.point_of_sail.Controller;

import org.example.point_of_sail.Service.impl.ProductServiceImpl;
import org.example.point_of_sail.Model.Repository.Entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductServiceImpl productServiceImpl;

@PostMapping("/add-product")
    public ProductEntity addProduct(@RequestBody ProductEntity product) {

        return this.productServiceImpl.addProduct(product);
    }

    @GetMapping("/delete-product")
    public String deleteProduct(@RequestParam Integer productId) {

        return this.productServiceImpl.deleteProduct(productId);
    }

    @PostMapping("/update-product")
    public String updateProduct(@RequestBody ProductEntity product) {

        return this.productServiceImpl.updateProduct(product);
    }

@GetMapping("/getAllProducts")
    public List<ProductEntity> getAllProducts() {
        return this.productServiceImpl.getAllProducts();
    }

    @GetMapping("/getProductByBarcode")
    public ProductEntity getProductByBarcode(@RequestParam String Barcode) {
        return productServiceImpl.getProductByBarcode(Barcode);
    }

    @GetMapping("/getProductById")
    public ProductEntity getProductById(@RequestParam Integer productId) {
        return productServiceImpl.getProductById(productId);
    }
}
