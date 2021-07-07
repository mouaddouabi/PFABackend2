package com.PfaBackend.beans;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class User extends Person{

    private String email;
    private String password;
}
