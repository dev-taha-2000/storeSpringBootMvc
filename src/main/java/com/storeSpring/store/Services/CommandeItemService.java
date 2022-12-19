package com.storeSpring.store.Services;

import com.storeSpring.store.Entity.CommandeItem;
import org.springframework.stereotype.Service;

@Service
public interface CommandeItemService {

    CommandeItem save (CommandeItem commandeItem);
}
