package com.storeSpring.store.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Commande",uniqueConstraints = {
        @UniqueConstraint(columnNames = "ref")
})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commande_id")
    private Long id;
    private String ref;
    @Column(nullable = false)
    private LocalDate date = LocalDate.now();
    private float prixTotal;
    // collum for the enum status
    @Column(nullable = false)
    private String status;
    @ManyToOne
    @JoinColumn(name = "client_id")
    //@JsonManagedReference
    private Client client;

    @OneToMany(mappedBy = "commande",cascade = CascadeType.ALL)
    //@JsonBackReference
    private List<CommandeItem> commandeItems;

}