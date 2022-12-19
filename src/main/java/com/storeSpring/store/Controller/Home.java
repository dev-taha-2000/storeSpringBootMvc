package com.storeSpring.store.Controller;

import com.storeSpring.store.Entity.Product;
import com.storeSpring.store.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class Home {
    @Autowired
    ProductService  productService;
    @GetMapping("/home")
    public String getHomePage(Model model){
        List<Product> productList = productService.getAll();
        model.addAttribute("productList",productList);
        return "home";
    }
}
