package ProjectaproII2026.introduction;

import java.util.Scanner;

public class HitungRata3 {
    int N;
    int x, total = 0;
    double rata;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HitungRata3 obj = new HitungRata3();
        obj.run();
    }

    public void run() {
        System.out.print("Input N: ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Input bilangan" + i + ": ");
            x = sc.nextInt();
            total += x;
        }

        if (N > 0) {
            rata = (double) total / N;
            System.out.println("Rata-rata: " + rata);
        } else {
            System.out.println("Tidak ada data untuk dihitung rata-rata.");
        }
    }
}



