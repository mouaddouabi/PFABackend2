package com.PfaBackend.beans;

import com.fasterxml.jackson.annotation.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties("lot")
public class Lot {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codeLot;
   private String variete;
   @JsonFormat(pattern="yyyy-MM-dd")
   private Date dateLivraison;
   private String etatFraicheur;
   private String maturite;
   private String fermentation;
   private String corpsEtrangers;
   private String humidite;
   private String aspectSanitaire;
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int numLotAppro;
   @JsonFormat(pattern="yyyy-MM-dd")
   private Date dateRecolte;
   //code Lot Production
   private int codeLotProduction;
   @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
   @JoinColumn(name = "codeParc",referencedColumnName = "codeParc")
   private Parcelle parcelle;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "numTransp",referencedColumnName = "numTransp")
   private Transport transport;
   @JsonIgnore
   @OneToOne(mappedBy = "lot")
   private FicheFumigation ficheFumigation;
   @JsonIgnore
   @OneToOne(mappedBy = "lot")
   private BonEntree bonEntree;
   @JsonBackReference
   @OneToOne(mappedBy = "lot")
   private FicheReception ficheReception;
   @JsonIgnore
   @OneToOne(mappedBy = "lot")
   private FicheHumidite ficheHumidite;
   @JsonIgnore
   @OneToOne(mappedBy = "lot")
   private FicheConditionnement ficheConditionnement;
   @JsonIgnore
   @OneToOne(mappedBy = "lot")
   private Tracabilite tracabilite;

}