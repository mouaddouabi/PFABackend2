package com.PfaBackend.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@ToString
public abstract class Person {
   @Id
   @GeneratedValue(strategy=GenerationType.SEQUENCE)
   protected long id;
   protected String nom;
   protected String prenom;
   protected String telephone;
   protected String adresse;

}