/* ILP506 – Turma Manhã – Nome: Lucas Belleza Spina */

import java.util.Scanner;
import java.lang.Math;

public class EX1 {
  
  public static void main(String[] args) {
    Scanner lerTeclado = new Scanner(System.in);
    int n, i = 2;
    
    do {
      System.out.print("Digite n: ");
      n = lerTeclado.nextInt();
    } while (n <= 0);
    lerTeclado.close();
    
    if (n != 1){
       boolean primo = true; 
       while (i <= Math.sqrt(n) && primo){
         if (n % i == 0)
            primo = false;
         i++;
       } 
       
       if(primo)
         System.out.print(n +" é primo.");
       else
         System.out.print(n +" nao é primo.");
    }
    else
      System.out.print(n +" nao é primo.");
  }

}
