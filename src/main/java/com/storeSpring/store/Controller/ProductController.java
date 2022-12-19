package com.storeSpring.store.Controller;


import com.storeSpring.store.Entity.Client;
import com.storeSpring.store.Entity.Commande;
import com.storeSpring.store.Entity.CommandeItem;
import com.storeSpring.store.FileUploadUtil;
import org.springframework.boot.Banner;
import org.springframework.util.StringUtils;
import com.storeSpring.store.Entity.Product;
import com.storeSpring.store.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping(path = "/save")
    public String save(Product product,@RequestParam("img") MultipartFile multipartFile)throws IOException{
        if(product==null)return "product/create";
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        product.setImg(fileName);
        Product saveProduct =  productService.save(product);
        String uploadDir = "static.img/"+saveProduct.getId();
        FileUploadUtil.saveFile(uploadDir,fileName,multipartFile);
        return "redirect:/home";
    }

    @GetMapping(path = "create")
    public String create( Model model){
        model.addAttribute("product",new Product());
        return "product/create";
    }
    @GetMapping(path = "/productDetaill")
    public String productDetaill(Model model , @RequestParam("id") Long id){
        Product product =productService.getOne(id);
        if(product==null)return "home";
        model.addAttribute("product",product);
        model.addAttribute("productObjet",new Product());
        return "product/productDetaill";
    }
    @GetMapping(path = "/productItems")
    public String productItems(){
        return "product/productItems";
    }

}
