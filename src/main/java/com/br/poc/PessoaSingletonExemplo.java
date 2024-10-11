package com.br.poc;

import lombok.Getter;

@Getter
public enum PessoaSingletonExemplo {

  INSTANCE(new Pessoa("Renato"));

  private final Pessoa pessoa;

  PessoaSingletonExemplo(Pessoa pessoa) {
    this.pessoa = pessoa;
  }
}
