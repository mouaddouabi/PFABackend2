package com.PfaBackend.beans; /***********************************************************************
 * Module:  Ferme.java
 * Author:  asmae
 * Purpose: Defines the Class Ferme
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ferme implements Serializable {
   @Id
   @GeneratedValue
   private Long codeFerme;
   private String region;
   @JsonBackReference
   @ManyToOne
   @JoinColumn(name = "codeFr",referencedColumnName = "codeFr",nullable = false)
   private Fournisseur fournisseur;
   //@JsonManagedReference
   @JsonIgnore
   @OneToMany(mappedBy = "ferme")
   private Set<Parcelle> parcelle;

}