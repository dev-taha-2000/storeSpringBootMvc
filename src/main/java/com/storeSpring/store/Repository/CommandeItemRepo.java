package com.storeSpring.store.Repository;

import com.storeSpring.store.Entity.CommandeItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeItemRepo extends JpaRepository<CommandeItem,Long> {
}
