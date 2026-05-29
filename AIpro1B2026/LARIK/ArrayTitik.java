package AIpro1B2026.LARIK;

import java.util.Scanner;

public class ArrayTitik {
    int N = 5;
    TitikM[] titikArray = new TitikM[N];

    void baca(){
            Scanner sc = new Scanner(System.in);
            for (int i=0; i<N; i++) {
                System.out.print("input elemen ke: "+i+"  ");
                titikArray[i] = new TitikM();
                titikArray[i].baca();
            }
    }

    void tulis(){
            for (int i=0; i<N; i++) {
                System.out.print("input elemen ke: "+i+"adalah ");
                titikArray[i].tulis();
            }
    }
    public static void main(String[] args) {
        ArrayTitik arrayTitik = new ArrayTitik();
        arrayTitik.baca();
        arrayTitik.tulis();


    }
}
