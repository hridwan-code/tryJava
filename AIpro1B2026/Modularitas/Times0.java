package AIpro1B2026.Modularitas;

import java.util.Scanner;

public class Times0 {
    int h, m, d;

    void baca() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input jam: "); h = sc.nextInt();
        while ((h > 23) || (h < 0)) {
            System.out.println("input jam salah, ulangi!");
            System.out.print("input jam: "); h = sc.nextInt();
        }
        System.out.print("input menit: "); m = sc.nextInt();
        while ((m > 59) || (m < 0)) {
            System.out.println("input menit salah, ulangi!");
            System.out.print("input menit: "); m = sc.nextInt();
        }
        System.out.print("input detik: "); d = sc.nextInt();
        while ((d > 59) || (d < 0)) {
            System.out.print("input detik: "); d = sc.nextInt();
        }
    }

    void tulis() {
        System.out.println("Time = <" + h + ":" + m + ":" + d + ">");
    }
    int totaldetik() {
        return h*3600+m*60+d;
    }
    Times0 totalTojam(int TotalD) {
        Times0 T=new Times0();

        T.h=(int) TotalD/ (int) 3600;
        int sisa= TotalD % 3600;
        T.m=(int) sisa / (int) 60;
        T.d=sisa % 60;
        return T;
    }

    void WaktuTempuh (Times0 TS, Times0 TF) {
        int totalf = TF.totaldetik();
        System.out.println("Total Finish: "+totalf+" detik");
        int totals = TS.totaldetik();
        System.out.println("Total Start: "+totals+" detik");
        int TotalTempuh = totalf - totals;
        System.out.println("Total Tempuh: "+TotalTempuh+" detik");
        Times0 tempuh=totalTojam(TotalTempuh);
        System.out.println("Total Tempuh Dalam Jam: ");
        tempuh.tulis();
    }

    public static void main(String[] args) {
        Times0 TS = new Times0();
        Times0 TF = new Times0();

        System.out.println("Input Start Time: ");
        TS.baca();
        System.out.println("Input Finish Time: ");
        TF.baca();

        TS.WaktuTempuh(TS, TF);

    }
}
