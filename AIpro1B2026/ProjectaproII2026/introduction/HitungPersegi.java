package ProjectaproII2026.introduction;

import java.util.Scanner;

public class HitungPersegi {

  public static void main(String[] args) {
    double p,l, luas;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang: ");
    p = sc.nextDouble();
    System.out.print("Masukkan lebar: ");
    l = sc.nextDouble();
    luas = p * l;
    System.out.println("Luas persegi panjang: " + luas);
    sc.close();
  }
}