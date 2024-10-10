package com.br.poc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ParametrosBuilderExemploTest {

  @Test
  void deveCriarUmaInstanciaComOsParametrosObrigatorios() {

    ParametrosBuilderExemplo sut = ParametrosBuilderExemplo.builder("A", "B")
        .param3("C")
        .build();

    assertThat(sut).isNotNull();
    assertThat(sut.getParam1()).isEqualTo("A");
    assertThat(sut.getParam2()).isEqualTo("B");
    assertThat(sut.getParam3()).isEqualTo("C");
  }

}