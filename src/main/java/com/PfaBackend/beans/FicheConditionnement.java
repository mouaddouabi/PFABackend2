package com.PfaBackend.beans; /***********************************************************************
 * Module:  FicheConditionnement.java
 * Author:  asmae
 * Purpose: Defines the Class FicheConditionnement
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class FicheConditionnement{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codeCondi;
   @JsonFormat(pattern="yyyy-MM-dd")
   private Date dateCondi;
   private int qteDateCondi;
   private String humiditeDateCondi;
   @ManyToOne
   @JoinColumn(name = "codeRespo",referencedColumnName = "codeRespo")
   private Responsable responsable;
   @OneToOne
   @JoinColumn(name = "codeLot",referencedColumnName = "codeLot")
   private Lot lot;
   @JsonManagedReference
   @OneToMany(mappedBy = "ficheConditionnement")
   private Set<Unites> unites;
   @OneToOne
   @JoinColumn(name = "codeEmb", referencedColumnName = "codeEmb")
   private Emballage emballage;

}