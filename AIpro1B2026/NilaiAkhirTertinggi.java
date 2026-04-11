package AIpro1B2026;

import java.util.Scanner;

public class NilaiAkhirTertinggi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();  
        String[] nama  = new String[n];
        double[] uts   = new double[n];
        double[] uas   = new double[n];
        double[] tugas = new double[n];
        double[] na    = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = sc.nextLine();
            System.out.print("UTS   : ");
            uts[i] = sc.nextDouble();
            System.out.print("UAS   : ");
            uas[i] = sc.nextDouble();
            System.out.print("Tugas : ");
            tugas[i] = sc.nextDouble();
            sc.nextLine();  
        }
        for (int i = 0; i < n; i++) {
            na[i] = 0.35 * uts[i] + 0.35 * uas[i] + 0.3 * tugas[i];
        }
        System.out.println("\n========== DAFTAR NILAI AKHIR ==========");
        System.out.printf("%-20s %s%n", "Nama", "Nilai Akhir");
        System.out.println("----------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %.2f%n", nama[i], na[i]);
        }
        double naTertinggi    = na[0];
        String namaTertinggi  = nama[0];
        for (int i = 1; i < n; i++) {
            if (na[i] > naTertinggi) {
                naTertinggi   = na[i];
                namaTertinggi = nama[i];
            }
        }
        System.out.println("========================================");
        System.out.println("NA TERTINGGI");
        System.out.printf("Nama        : %s%n", namaTertinggi);
        System.out.printf("Nilai Akhir : %.2f%n", naTertinggi);
        System.out.println("========================================");
        sc.close();
    }
}