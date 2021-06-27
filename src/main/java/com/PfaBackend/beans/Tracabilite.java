package com.PfaBackend.beans; /***********************************************************************
 * Module:  Tracabilite.java
 * Author:  asmae
 * Purpose: Defines the Class Tracabilite
 ***********************************************************************/

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Tracabilite {
   @Id
   private Long codeTracabilite;
   @OneToOne
   @JoinColumn(name = "codeLot",referencedColumnName = "codeLot")
   private Lot lot;

}