package com.PfaBackend.beans; /***********************************************************************
 * Module:  FicheMaterieEmb.java
 * Author:  asmae
 * Purpose: Defines the Class FicheMaterieEmb
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class FicheMaterieEmb {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long codeEmbg;
   @JsonFormat(pattern="yyyy-MM-dd")
   private Date date;
   @JsonManagedReference
   @OneToMany(mappedBy = "ficheMaterieEmb",cascade = CascadeType.ALL)
   private Set<Emballage> emballages;
   @ManyToOne
   @JoinColumn(name = "codeRespo",referencedColumnName = "id")
   private Responsable responsable;

   public FicheMaterieEmb() {
      this.emballages = new HashSet<>();
   }
}