package ProjectaproII2026.ARRAY;

import java.util.Scanner;

public class ArrayIntM {
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

    int cariF3(int x) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai yang dicari: ");
        int idx = -1;
        int i=0;
        while (i<N) {
            if (a[i]==x) {
                idx = i;
                break;
            }
            i++;
        }
        return idx;
    }

    int carif4(int x) {
        int idx=-1;
        int i=0;
        boolean ktmu=false;
        while ((i<N) && (!ktmu)) {
            if (a[i]==x) {
                idx=i;
                ktmu=true;
            }
            i++;
        }
        return idx;
    }

int carif5(int x) {
        int idx=-1;
        int i=0;
        boolean ktmu=false;
        while ((i<N) && (!ktmu)) {
            if (a[i]==x) {
                idx=i;
                ktmu=true;
            }else {
                if (a[i]>x) {
                    break;
                }
            }
            i++;
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

    public static void main(String[] args) {
        ArrayIntM A = new ArrayIntM();

        A.baca();
        A.tulis();

        A.cariF3(0);
        int hasil = A.carif4(0);
        A.hasilcari(hasil);
    }
}