package com.storeSpring.store.Services.Implementation;

import com.storeSpring.store.Entity.Client;
import com.storeSpring.store.Repository.ClientRepo;
import com.storeSpring.store.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepo clientRepo;

    @Override
    public Client getById(Long id) {
        return clientRepo.getById(id);
    }
}
