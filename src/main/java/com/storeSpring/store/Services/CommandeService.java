package com.storeSpring.store.Services;

import com.storeSpring.store.Entity.Commande;
import com.storeSpring.store.Entity.CommandeItem;
import org.springframework.stereotype.Service;

@Service
public interface CommandeService {

    Commande save(Commande commande);


}
