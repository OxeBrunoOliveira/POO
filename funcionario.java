package questao03;

import java.util.Scanner;

public class funcionario {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nome;
    double salarioBruno, imposto, salarioLiquido, porcentagem, salarioFinal;
    
    System.out.print("Nome: ");
    nome = entrada.nextLine();

    System.out.print("Salario bruno: ");
    salarioBruno = entrada.nextDouble();

    System.out.print("Imposto: ");
    imposto = entrada.nextDouble();

    salarioLiquido = salarioBruno - imposto;
    System.out.printf(nome + " , R$ %.2f%n", salarioLiquido);

    System.out.print("Porcentagem: ");
    porcentagem = entrada.nextDouble();

    salarioFinal = ((porcentagem * salarioBruno) / 100) + salarioLiquido;
    System.out.printf("O salario atualizados: " + nome + " R$ %.2f%n", salarioFinal);
    entrada.close();

  }
}
