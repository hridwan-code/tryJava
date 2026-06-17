package LARIK;

import java.util.Scanner;

public class ArrayString {
    int N = 5;
    String[] a = new String[N];

    void baca(){
            Scanner sc = new Scanner(System.in);
            for (int i=0; i<N; i++) {
                System.out.print("input elemen ke: "+i+"  ");
                a[i] = sc.nextLine();
            }
    }

    void tulis(){
            for (int i=0; i<N; i++) {
                System.out.println("input elemen ke: "+i+"adalah "+a[i]);
            }
    }
    public static void main(String[] args) {
        ArrayString array = new ArrayString();
        array.baca();
        array.tulis();


    }
}
