package com.PfaBackend.beans; /***********************************************************************
 * Module:  BonEntree.java
 * Author:  asmae
 * Purpose: Defines the Class BonEntree
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BonEntree {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long numBon;
   @JsonFormat(pattern="yyyy-MM-dd")
   private Date date;
   private int total;
   private String decision;
   private String remarqueBon;
   @ManyToOne
   @JoinColumn(name = "codeFr",referencedColumnName = "id")
   private Fournisseur fournisseur;
   @OneToOne(cascade = CascadeType.MERGE)
   @JoinColumn(name = "codeLot",referencedColumnName = "codeLot")
   private Lot lot;
   @ManyToOne
   @JoinColumn(name = "codeRespo",referencedColumnName = "id")
   private Responsable responsable;


}