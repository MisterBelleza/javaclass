/* ILP506 – Turma Manhã – Nome: Lucas Belleza Spina */

import java.util.Scanner;
import java.util.ArrayList;

public class EX3 {
  
  public static void main(String[] args) {
    Scanner lerTeclado = new Scanner(System.in);
    int i = 1, n;
    ArrayList<Integer> v = new ArrayList<Integer>();
    
    do {
       System.out.print("Digite " + i + "° digito: ");
       n = lerTeclado.nextInt();
       if (i == 1 && n == 0)
         System.out.println("Número invalido, 1° digito deve ser >0");
       else{
         v.add(n);
         i++;
       }
    } while ( i <= 5 );
    lerTeclado.close();
    
    System.out.println("Digito veriicador = "+ mod7(v));
    
 }
  
  private static int mod7(ArrayList<Integer> v) {
   int soma = 0;
   for (int i = 0; i < v.size(); i++){
      soma += (i+2) * v.get(i);
   }
   return soma % 7;
  }
}  
