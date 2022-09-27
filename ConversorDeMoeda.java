package questao01;
import java.util.Scanner;

public class ConversorDeMoeda {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double cotacaoDolar, valorDolar, valorReal;

    System.out.print("Digite o preco do dolar: ");
    cotacaoDolar = entrada.nextDouble();

    System.out.print("Digite a quantidade em dolar: ");
    valorDolar = entrada.nextDouble();

    valorReal = ((0.06 * valorDolar) * cotacaoDolar ) + (cotacaoDolar * valorDolar);

    System.out.println("O valor em reais e : R$ " + valorReal);
    entrada.close();
  }

}