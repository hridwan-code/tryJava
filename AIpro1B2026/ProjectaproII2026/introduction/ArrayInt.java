package ProjectaproII2026.introduction;
 
import java.util.Scanner;

class ArrayInt {
    public static void main(String[] args) {
      int N = 5;
      int[] arr = new int[N];

      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < N; i++) {
          System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
          arr[i] = sc.nextInt();
      }
      for (int i = 0; i < N; i++) {
          System.out.print("Elemen ke-" + (i + 1) + ": " + arr[i] + "\n");
    }
  }
}

