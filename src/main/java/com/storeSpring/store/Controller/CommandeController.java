package com.storeSpring.store.Controller;

import com.storeSpring.store.Entity.Client;
import com.storeSpring.store.Entity.Commande;
import com.storeSpring.store.Entity.CommandeItem;
import com.storeSpring.store.Services.ClientService;
import com.storeSpring.store.Services.CommandeItemService;
import com.storeSpring.store.Services.CommandeService;
import com.storeSpring.store.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.UUID;

@Controller
@RequestMapping("product")
public class CommandeController {
    private Commande commande = new Commande();
    private CommandeItem commandeItem = new CommandeItem();
    long id =1;
    @Autowired
    CommandeService commandeService;
    @Autowired
    CommandeItemService commandeItemService;
    @Autowired
    ProductService productService;
    @Autowired
    ClientService clientService;
    @PostMapping ("saveCommande")
    public String saveCommande(@RequestParam("nom") String nom, @RequestParam("quantity") int quantity,@RequestParam("price") float price, @RequestParam("priceTotal") float priceTotal,@RequestParam("id_product") Long id_product){
        commande.setPrixTotal(priceTotal);commande.setClient(clientService.getById(id));commande.setStatus("valide");commande.setDate(LocalDate.EPOCH);commande.setRef(UUID.randomUUID().toString());
        commandeItem.setCommande(commande);commandeItem.setPrice(price);commandeItem.setQuantity(quantity);commandeItem.setProduct(productService.getOne(id_product));commandeItem.setRef("refrefr");
        commandeService.save(commande);
        commandeItemService.save(commandeItem);
        return "redirect:/home";
    }
}
