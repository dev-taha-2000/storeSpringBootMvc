package com.storeSpring.store.Services.Implementation;

import com.storeSpring.store.Entity.CommandeItem;
import com.storeSpring.store.Repository.CommandeItemRepo;
import com.storeSpring.store.Services.CommandeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CommandeItemImpl implements CommandeItemService {
    @Autowired
    CommandeItemRepo commandeItemRepo;
    @Override
    public CommandeItem save(CommandeItem commandeItem){
       if(commandeItem==null)throw new IllegalArgumentException("cammande items is empty");
       return commandeItemRepo.save(commandeItem);
    }
}
