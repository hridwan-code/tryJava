package ProjectaproII2026.introduction;

import java.util.Scanner;

public class HitungRata {

  public static void main(String[] args) {
    double x, total, rata;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah data: ");
    int n = sc.nextInt();
    total = 0;
    for (int i = 1; i <= n; i++) {
      System.out.print("Masukkan data ke-" + i + ": ");
      x = sc.nextDouble();
      total += x;
    }

    rata = total / n;
    System.out.println("Rata-rata: " + rata);
    sc.close();
  }
} 