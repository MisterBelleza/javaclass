/*] ILP506 – Turma Manhã – Nome: Lucas Belleza Spina */

import java.util.Scanner;
import java.util.ArrayList;

public class EX4 {
  
  public static void main(String[] args) {
    Scanner lerTeclado = new Scanner(System.in);
    long n;
    System.out.print("Digite n: ");
    n = lerTeclado.nextInt();
    ArrayList<Long> v = new ArrayList<Long>();
    v.add((long)0);
    v.add((long)1);
    for (int i = 0; i < n-1; i++){
      v.add( v.get(i) + v.get(i+1) );
    }
    
    if (n > 93)
      System.out.println("A partir do indicie 94 a variavel long não suporta os valores");
    
    long ultimo = v.get(v.size()-1);
    int tamanho_v = String.valueOf(ultimo).length();
    int tamanho_n = String.valueOf(n).length();
    for (int i = 0; i < v.size()-1; i++){
      String str = String.format("[%0"+ tamanho_n +"d]: %"+ tamanho_v +"d    ", i+1, v.get(i));
      System.out.print(str);
      if (i % 10 == 9)
         System.out.print("\n");
    }
  }
}
