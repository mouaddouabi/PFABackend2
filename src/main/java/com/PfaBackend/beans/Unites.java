package com.PfaBackend.beans; /***********************************************************************
 * Module:  Unites.java
 * Author:  asmae
 * Purpose: Defines the Class Unites
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Unites implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long numSerieUnitesInit;
   private int volumeUnite;
   private int nbreUnitesCondi;
   private int numColis;
   private int nbreBraquettesParColis;
   private int nbreColis;
   @JsonBackReference
   @ManyToOne
   @JoinColumn(name = "codeCondi",referencedColumnName = "codeCondi")
   private FicheConditionnement ficheConditionnement;

}