package com.PfaBackend.beans; /***********************************************************************
 * Module:  FicheFumigation.java
 * Author:  asmae
 * Purpose: Defines the Class FicheFumigation
 ***********************************************************************/

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
public class FicheFumigation {
   @Id
   @GeneratedValue(strategy =  GenerationType.AUTO)
   private Long codeFumigation;
   private Date dateFum;
   private Date heureDFum;
   private Date heureFinFum;
   private int dureeFum;
   private int tauxPhosphine;
   private String tStockage;
   private String humiditeStockage;
   @OneToOne
   @JoinColumn(name = "codeLot",referencedColumnName = "codeLot")
   private Lot lot;
   @ManyToOne
   @JoinColumn(name = "codeRespo",referencedColumnName = "id")
   private Responsable responsable;
   @ManyToMany
   @JoinColumn(name = "codeOpt",referencedColumnName = "codeOpt")
   private Set<Operateurs> operateurs;

}