package com.ranetech.demo.domain;


/*  Usando o Lombok, podemos gerar automaticamente os getters e setters,
    construtores, etc.

    @Getter e @Setter servem para gerar os getters e setters automaticamente;
    @AllArgsConstructor serve para gerar o construtor com todos os argumentos;
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private String email;
}
