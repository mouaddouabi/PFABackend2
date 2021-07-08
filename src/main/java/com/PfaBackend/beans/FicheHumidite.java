package com.PfaBackend.beans; /***********************************************************************
 * Module:  FicheHumidite.java
 * Author:  asmae
 * Purpose: Defines the Class FicheHumidite
 ***********************************************************************/

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class FicheHumidite {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codeOpHumidite;
   //change
   @JsonFormat(pattern="yyyy-MM-dd")
   private Date dateOp;
   private int humidite;
   private int numChRefroidissement;
   private String remarque;
   private int mesuresCor;
   @ManyToOne
   @JoinColumn(name = "codeRespo",referencedColumnName = "codeRespo")
   private Responsable responsable;
   //change
   @OneToOne
   @JoinColumn(name = "codeLot",referencedColumnName = "codeLot")
   private Lot lot;

}