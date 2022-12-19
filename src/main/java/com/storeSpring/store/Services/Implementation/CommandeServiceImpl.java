package com.storeSpring.store.Services.Implementation;

import com.storeSpring.store.Entity.Commande;
import com.storeSpring.store.Entity.CommandeItem;
import com.storeSpring.store.Repository.CommandeItemRepo;
import com.storeSpring.store.Repository.CommandeRepo;
import com.storeSpring.store.Services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandeServiceImpl implements CommandeService {
    @Autowired
    CommandeRepo commandeRepo;
    @Autowired
    CommandeItemRepo commandeItemRepo;
    @Override
    public Commande save(Commande commande) {
        if (commande==null)throw new IllegalArgumentException("commande is empty");
        return commandeRepo.save(commande);
    }


}
