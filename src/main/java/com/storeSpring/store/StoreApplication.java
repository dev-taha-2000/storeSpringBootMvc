package com.storeSpring.store;

import com.storeSpring.store.Entity.Client;
import com.storeSpring.store.Entity.Commande;
import com.storeSpring.store.Services.ClientService;
import com.storeSpring.store.Services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.*;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner {
	@Autowired
	CommandeService commandeService;
	@Autowired
	ClientService clientService;
	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===============state==================");
		/**long id =1;
		Commande commande = new Commande();
		Client client = clientService.getById(id);
		commande.setRef("refrefref");
		commande.setClient(client);
		commande.setStatus("valide");
		commande.setPrixTotal(1252.5);
		commande.setDate(LocalDate.EPOCH);
		commandeService.save(commande);
        **/
	}
}


