package ProjectaproII2026.ARRAY;

import java.util.Scanner;

public class ArrayInt {
  public static void main (String[] args) {
    int N=5;
    int[] a=new int[N];
    Scanner input = new Scanner(System.in);
    for (int i=0; i<N; i++) {
      System.out.print("Input elemen array ke" + (i+1) + ": ");
      a[i] = input.nextInt();
    }
    for (int i=0; i<N; i++) {
      System.out.println("Elemen array ke-" + (i+1) + ": " + a[i]);
    }
  }
  
}
