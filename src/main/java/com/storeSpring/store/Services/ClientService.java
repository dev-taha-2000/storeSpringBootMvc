package com.storeSpring.store.Services;

import com.storeSpring.store.Entity.Client;
import org.springframework.stereotype.Service;

@Service
public interface ClientService {

    Client getById(Long id);
}
