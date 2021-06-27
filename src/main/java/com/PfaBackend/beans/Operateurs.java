package com.PfaBackend.beans; /***********************************************************************
 * Module:  Operateurs.java
 * Author:  asmae
 * Purpose: Defines the Class Operateurs
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Operateurs extends Person {
   private Long codeOpt;
   private String operation;
   @JsonIgnore
   @ManyToMany(mappedBy = "operateurs")
   private Set<FicheFumigation> ficheFumigation;
   @JsonIgnore
   @ManyToMany(mappedBy = "operateur")
   private Set<Emballage> emballages;

}