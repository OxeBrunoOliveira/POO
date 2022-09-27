package questao02;

import java.util.Scanner;

public class retangulo {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double largura, altura, area, perimetro, diagonal;

    System.out.println("Digite a largura do triangulo: ");
    largura = entrada.nextDouble();

    System.out.println("Digite a altura do triangulo: ");
    altura = entrada.nextDouble();

    area = largura * altura;
    perimetro = ( 2 * largura) + (2 * altura);
    diagonal = Math.sqrt(((Math.pow(altura, 2)) + (Math.pow(largura, 2))));

    System.out.printf("AREA = %.2f%n", area);
    System.out.printf("PERIMETER = %.2f%n", perimetro);
    System.out.printf("DIAGONAL = %.2f%n", diagonal);
    entrada.close();

  }  
}
