package com.br.poc;


import lombok.Getter;

@Getter
public class Pessoa {

  private final String nome;

  public Pessoa(String nome) {
    this.nome = nome;
  }
}
