package com.PfaBackend.beans; /***********************************************************************
*/

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties("fournisseur")
public class Fournisseur extends Person implements Serializable {
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codeFr;
   @JsonManagedReference
   @OneToMany(mappedBy = "fournisseur")
   private Set<Ferme>  ferme;

   @JsonIgnore
   @OneToMany(mappedBy = "fournisseur")
   private Set<FicheReception>  ficheReception;

   @JsonIgnore
   @OneToMany(mappedBy = "fournisseur")
   private Set<BonEntree>  bonEntree;

}