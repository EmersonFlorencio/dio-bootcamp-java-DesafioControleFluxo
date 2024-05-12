package org.dio.bootcamp.java;

public class ParametrosInvalidosException extends Exception{

  public ParametrosInvalidosException() {
    super();
  }

  @Override
  public String toString() {
    return "O segundo parâmetro deve ser maior que o primeiro";
  }
}
