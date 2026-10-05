package ProjectaproII2026.ARRAY;

import java.util.Scanner;

public class ArrayChar {
    int N=5;
    char[] a=new char[N];

  void baca() {
    Scanner input = new Scanner(System.in);
    for (int i=0; i<N; i++) {
      System.out.print("Input elemen array ke" + (i+1) + ": ");
      a[i] = input.next().charAt(0);
  }
}
  void tulis() {
    for (int i=0; i<N; i++) {
      System.out.println("Elemen array ke-" + (i+1) + ": " + a[i]);
    }
  }
  public static void main (String[] args) {
    ArrayChar A = new ArrayChar();
    A.baca();
    A.tulis();
  }
}


