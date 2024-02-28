/* IES300 – Turma Manhã – Nome: Lucas Belleza Spina */

import java.util.Scanner;

public class Temperaturas {
  
  public static void main(String[] args) {
    Scanner lerTeclado = new Scanner(System.in);
    float f;
    
    System.out.print("Digite temperatura em Fahrenheit: ");
    f = lerTeclado.nextFloat();
    lerTeclado.close();
    
    String str = String.format("Temperatura em Celsius: %.2f C.",(f-32) * 5 / 9.);
    System.out.print(str);
   }
}
