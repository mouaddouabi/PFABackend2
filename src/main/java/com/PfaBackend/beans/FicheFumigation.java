package com.PfaBackend.beans; /***********************************************************************
 * Module:  FicheFumigation.java
 * Author:  asmae
 * Purpose: Defines the Class FicheFumigation
 ***********************************************************************/

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

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
   //change
   @JsonFormat(pattern="yyyy-MM-dd")
   private Date dateFum;
   @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm")
   private Date heureDFum;
   @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm")
   private Date heureFinFum;
   private String dureeFum;
   private int tauxPhosphine;
   private String tStockage;
   private String humiditeStockage;
   //change
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