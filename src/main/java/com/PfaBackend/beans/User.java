package com.PfaBackend.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor

@AllArgsConstructor
public class User extends Person{

    private String email;
    private String password;
}
