package com.PfaBackend.beans; /***********************************************************************
 * Module:  FicheHumidite.java
 * Author:  asmae
 * Purpose: Defines the Class FicheHumidite
 ***********************************************************************/

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class FicheHumidite {
   @Id
   private Long codeOpHumidite;
   private Date dateOp;
   private int codeLotPro;
   private int humidite;
   private int numChRefroidissement;
   private String remarque;
   private int mesuresCor;
   @ManyToOne
   @JoinColumn(name = "codeRespo",referencedColumnName = "codeRespo")
   private Responsable responsable;
   @OneToOne
   @JoinColumn(name = "codeLot",referencedColumnName = "codeLot")
   private Lot lot;

}