/* ILP506 – Turma Manhã – Nome: Lucas Belleza Spina */

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class EX2 {
  
  public static void main(String[] args) {
    Scanner lerTeclado = new Scanner(System.in);
    int min, max, i;
    ArrayList<Integer> v = new ArrayList<Integer>();
    
    do {
       System.out.print("Digite Min: ");
       min = lerTeclado.nextInt();
       System.out.print("Digite Max: ");
       max = lerTeclado.nextInt();
    } while (min < 2 || max > 999999 || min > max);
    lerTeclado.close();
    
    for (i = min; i <= max; i++){
      if (ePrimo(i))
         v.add(i);
    }
    
    int ultimo = v.get(v.size()-1);
    int tamanho_v = String.valueOf(ultimo).length();
    int tamanho_size = String.valueOf(v.size()).length();
    for (i=0; i < v.size(); i++){
      String str = String.format("[%0"+ tamanho_size +"d]: %"+ tamanho_v +"d    ", i, v.get(i));
      System.out.print(str);
      if (i % 10 == 9)
         System.out.print("\n");
    }
  }
  
  private static boolean ePrimo(int n) {
   int i = 2;
    
   boolean primo = true; 
   while (i <= Math.sqrt(n) && primo){
      if (n % i == 0)
         primo = false;
      i++;
      }
   if(primo)
     return true;
   else
     return false;
   }
 }
