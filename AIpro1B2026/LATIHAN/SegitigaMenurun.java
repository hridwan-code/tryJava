package AIpro1B2026.LATIHAN;

import java.util.Scanner;

public class SegitigaMenurun {
    public static void main (String[] args) {
        int N;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        N = sc.nextInt();
        for (int i=N; i>=1; i--) {
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
