package ProjectaproII2026.ARRAY;

import java.util.Scanner;

public class ArrayString {
    int N=5;
    String[] a=new String[N];

  void baca() {
    Scanner input = new Scanner(System.in);
    for (int i=0; i<N; i++) {
      System.out.print("Input elemen array ke" + (i+1) + ": ");
      a[i] = input.nextLine();
  }
}
  void tulis() {
    for (int i=0; i<N; i++) {
      System.out.println("Elemen array ke-" + (i+1) + ": " + a[i]);
    }
  }
  public static void main (String[] args) {
    ArrayString A = new ArrayString();
    A.baca();
    A.tulis();
  }
}

