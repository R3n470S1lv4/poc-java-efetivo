package com.br.poc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PessoaSingletonExemploTest {

  @Test
  void deveRetornarSempreAMesmaReferencia() {
    Pessoa pessoa1 = PessoaSingletonExemplo.INSTANCE.getPessoa();
    Pessoa pessoa2 = PessoaSingletonExemplo.INSTANCE.getPessoa();

    Assertions.assertThat(pessoa1).isEqualTo(pessoa2);
    Assertions.assertThat(pessoa1.getNome()).isEqualTo("Renato");
  }
}