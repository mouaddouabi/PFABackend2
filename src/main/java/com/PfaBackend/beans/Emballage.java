package com.PfaBackend.beans; /***********************************************************************
 * Module:  Emballage.java
 * Author:  asmae
 * Purpose: Defines the Class Emballage
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Emballage {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codeEmb;
   private String frEmb;
   private int codeFrEmb;
   private int numLotEmb;
   private String typeEmb;
   private int volumeUnite;
   private String condStockage;
   @JsonFormat(pattern="yyyy-MM-dd")
   private Date dateCond;
   private String lavageSechageEmb;
   private String actionsCor;
   @JsonBackReference
   @ManyToOne()
   @JoinColumn(name = "codeEmbg", referencedColumnName = "codeEmbg")
   private FicheMaterieEmb ficheMaterieEmb;
   @JsonIgnore
   @OneToOne(mappedBy = "emballage")
   private FicheConditionnement ficheConditionnement;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "id_op", referencedColumnName = "id")
   private Operateurs operateur;
}