package com.PfaBackend.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Responsable extends Person implements Serializable {
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codeRespo;
   private String fonctionRespo;
   @JsonIgnore
   @OneToMany(mappedBy = "responsable")
   private Set<BonEntree> bonEntree;
   @JsonIgnore
   @OneToMany(mappedBy = "responsable")
   private Set<FicheMaterieEmb> ficheMaterieEmb;
   @JsonIgnore
   @ManyToMany(mappedBy = "responsable")
   private Set<FicheReception> ficheReception;
   @JsonIgnore
   @OneToMany(mappedBy = "responsable")
   private Set<FicheFumigation> ficheFumigation;
   @JsonIgnore
   @OneToMany(mappedBy = "responsable")
   private Set<FicheHumidite> ficheHumidite;
   @JsonIgnore
   @OneToMany(mappedBy = "responsable")
   private Set<FicheConditionnement> ficheConditionnement;

}