package com.PfaBackend.beans; /***********************************************************************
 * Module:  Parcelle.java
 * Author:  asmae
 * Purpose: Defines the Class Parcelle
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Parcelle {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codeParc;
   private String tracesTerre;
   @JsonIgnore
   @OneToMany(mappedBy = "parcelle")
   private Set<Lot> lots;
   //@JsonBackReference
   @ManyToOne
   @JoinColumn(name = "codeFerme",referencedColumnName = "codeFerme")
   private Ferme ferme;
}