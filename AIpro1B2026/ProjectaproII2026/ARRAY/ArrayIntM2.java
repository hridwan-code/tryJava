package ProjectaproII2026.ARRAY;

import java.util.Scanner;

public class ArrayIntM2 {
    int N = 5;
    int[] a = new int[N];

    void baca() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            System.out.print("Input elemen array ke-" + (i + 1) + ": ");
            a[i] = input.nextInt();
        }
    }

    void tulis() {
        for (int i = 0; i < N; i++) {
            System.out.println(
                "Elemen array ke-" + (i + 1) + ": " + a[i]
            );
        }
    }

    int cari() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai yang dicari: ");
        int x = sc.nextInt();

        int idx = -1;

        // Traversal dari belakang
        for (int i = N - 1; i >= 0; i--) {
            if (a[i] == x) {
                idx = i;
                break;
            }
        }

        return idx;
    }

    void hasilcari(int id) {
        if (id != -1) {
            System.out.println(
                "Nilai ditemukan pada indeks ke-" + (id + 1)
            );
        } else {
            System.out.println("Nilai tidak ditemukan");
        }
    }
      void cari2() {
      Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai yang dicari: ");
        int x = sc.nextInt();
        int idx = -1;
        // Traversal dari belakang
        for (int i = N - 1; i >= 0; i--) {
            if (a[i] == x) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            System.out.println(
                "Nilai ditemukan pada indeks ke-" + (idx + 1)
            );
        } else {
            System.out.println("Nilai tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        ArrayIntM A = new ArrayIntM();

        A.baca();
        A.tulis();

        int hasil = A.cari();
        A.hasilcari(hasil);
    }
}
