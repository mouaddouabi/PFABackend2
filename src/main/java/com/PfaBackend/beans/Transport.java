package com.PfaBackend.beans; /***********************************************************************
 * Module:  Transport.java
 * Author:  asmae
 * Purpose: Defines the Class Transport
 ***********************************************************************/

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Transport {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long numTransp;
   private String matricule;
   private String nomTranspt;
   @JsonIgnore
   @OneToOne(mappedBy = "transport",cascade = CascadeType.PERSIST)
   private Lot lot;

}