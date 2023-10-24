package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sumNota = 0;
    int sumPeso = 0;

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    String quantidade = scanner.nextLine();
    int fortmatedQuantity = Integer.parseInt(quantidade);

    for (int index = 0; index < fortmatedQuantity; index += 1) {
      System.out.println("Digite o nome da atividade " + (index + 1) + ":");
      String nome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (index + 1) + ":");
      String pesoString = scanner.nextLine();
      System.out.println("Digite a nota obtida para " + nome + ":");
      String notaString = scanner.nextLine();

      int peso = Integer.parseInt(pesoString);
      int nota = Integer.parseInt(notaString);
      sumNota += nota * peso;
      sumPeso += peso;
    }

    int result = sumNota / sumPeso;
    double resultFormated = (double) result;

    if (sumPeso != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else if (result >= 85) {
      System.out.println("Parabéns! Você alcançou "
          + resultFormated + "%! E temos o prazer de informar "
          + "que você obteve aprovação! ");
    } else {
      System.out.println("Lamentamos informar que, com base na sua "
          + "pontuação alcançada neste período, "
          + resultFormated + "%, você não atingiu a pontuação mínima "
          + "necessária para sua aprovação.");
    }

    scanner.close();
  }
}