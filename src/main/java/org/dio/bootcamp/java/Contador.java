package org.dio.bootcamp.java;

import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    try {
      //chamando o método contendo a lógica de contagem
      contar(parametroUm, parametroDois);

    }catch (ParametrosInvalidosException e) {
      //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
      System.out.println(e);
    }
  }
  static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois){
      throw new ParametrosInvalidosException();
    }

    int contagem = parametroDois - parametroUm;
    for (int index = 1; index <= contagem; index++){
      System.out.println("Imprimindo o número " + index );
    }
  }
}
