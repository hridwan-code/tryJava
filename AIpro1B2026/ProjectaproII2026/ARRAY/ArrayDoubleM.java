package ProjectaproII2026.ARRAY;

import java.util.Scanner;

public class ArrayDoubleM {
    int N=5;
    double[] a=new double[N];

  void baca() {
    Scanner input = new Scanner(System.in);
    for (int i=0; i<N; i++) {
      System.out.print("Input elemen array ke" + (i+1) + ": ");
      a[i] = input.nextDouble();
  }
}
  void tulis() {
    for (int i=0; i<N; i++) {
      System.out.println("Elemen array ke-" + (i+1) + ": " + a[i]);
    }
  }
  public static void main (String[] args) {
    ArrayDoubleM A = new ArrayDoubleM();
    A.baca();
    A.tulis();
  }
}


