package ProjectaproII2026.ARRAY;

import java.util.Scanner;

public class ArrayIntM {
    int N=5;
    int[] a=new int[N];

  void baca() {
    Scanner input = new Scanner(System.in);
    for (int i=0; i<N; i++) {
      System.out.print("Input elemen array ke" + (i+1) + ": ");
      a[i] = input.nextInt();
  }
}
  void tulis() {
    for (int i=0; i<N; i++) {
      System.out.println("Elemen array ke-" + (i+1) + ": " + a[i]);
    }
  }
  public static void main (String[] args) {
    ArrayIntM A = new ArrayIntM();
    A.baca();
    A.tulis();
  }
}

