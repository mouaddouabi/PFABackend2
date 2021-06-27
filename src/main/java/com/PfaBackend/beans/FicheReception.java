package com.PfaBackend.beans; /***********************************************************************
 * Module:  FicheReception.java
 * Author:  asmae
 * Purpose: Defines the Class FicheReception
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties("ficheReception")
public class FicheReception {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codeRecep;
  // @JsonFormat(pattern="yyyy-MM-dd")
  // private Date dateLivraison;
   private int qteLivree;
   private String commentaire;
   private String typeCorpsEtrangers;
   private String humiditeDattes;

   @ManyToOne
   @JoinColumn(name = "codeFr",referencedColumnName = "codeFr")
   private Fournisseur fournisseur;

   @ManyToMany
   @JoinColumn(name = "codeRespo",referencedColumnName = "codeRespo")
   private Set<Responsable> responsable;

   @JsonManagedReference
   @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
   @JoinColumn(name = "codeLot",referencedColumnName = "codeLot")
   private Lot lot;
}