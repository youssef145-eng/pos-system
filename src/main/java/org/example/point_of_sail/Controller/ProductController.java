package org.example.point_of_sail.Controller;

import org.example.point_of_sail.Dao.ProductDao;
import org.example.point_of_sail.Entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductDao productDao;

@PostMapping("/add-product")
    public ProductEntity addProduct(@RequestBody ProductEntity product) {

        return this.productDao.addProduct(product);
    }

    @GetMapping("/delete-product")
    public String deleteProduct(@RequestParam Integer productId) {

        return this.productDao.deleteProduct(productId);
    }

    @PostMapping("/update-product")
    public String updateProduct(@RequestBody ProductEntity product) {

        return this.productDao.updateProduct(product);
    }

@GetMapping("/getAllProducts")
    public List<ProductEntity> getAllProducts() {
        return this.productDao.getAllProducts();
    }

    @GetMapping("/getProductByBarcode")
    public ProductEntity getProductByBarcode(@RequestParam String Barcode) {
        return productDao.getProductByBarcode(Barcode);
    }

    @GetMapping("/getProductById")
    public ProductEntity getProductById(@RequestParam Integer productId) {
        return productDao.getProductById(productId);
    }
}
