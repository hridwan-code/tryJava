package AIpro1B2026.LARIK;

import java.util.Scanner;

public class ArrayInt {
    int N = 5;
    int[] a = new int[N];

    void baca(){
            Scanner sc = new Scanner(System.in);
            for (int i=0; i<N; i++) {
                System.out.print("input elemen ke: "+i+"  ");
                a[i] = sc.nextInt();
            }
    }

    void tulis(){
            for (int i=0; i<N; i++) {
                System.out.println("input elemen ke: "+i+"adalah "+a[i]);
            }
    }
    public static void main(String[] args) {
        ArrayInt arrayInt = new ArrayInt();
        arrayInt.baca();
        arrayInt.tulis();


    }
}
