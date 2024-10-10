package com.br.poc;

import lombok.Getter;

@Getter
public class ParametrosBuilderExemplo {

  private final String param1;
  private final String param2;

  private String param3;
  private String param4;
  private String param5;
  private String param6;
  private String param7;
  private String param8;


  public static Builder builder(String param1, String param2){
    return new Builder(param1, param2);
  }

  public static class Builder {
    private final String param1;
    private final String param2;

    private String param3;
    private String param4;
    private String param5;
    private String param6;
    private String param7;
    private String param8;

    public Builder(String param1, String param2){
      this.param1 = param1;
      this.param2 = param2;
    }

    public Builder param3(String param3){
      this.param3 = param3;
      return self();
    }

    private Builder self(){
      return this;
    }

    public ParametrosBuilderExemplo build(){
      return new ParametrosBuilderExemplo(this);
    }

  }

  private ParametrosBuilderExemplo(Builder builder) {
    this.param1 = builder.param1;
    this.param2 = builder.param2;
    this.param3 = builder.param3;
    this.param4 = builder.param4;
    this.param5 = builder.param5;
    this.param6 = builder.param6;
    this.param7 = builder.param7;
    this.param8 = builder.param8;
  }
}
