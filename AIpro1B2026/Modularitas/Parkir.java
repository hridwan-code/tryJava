package AIpro1B2026.Modularitas;

import java.util.Scanner;

public class Parkir {
    Times0 jmasuk=new Times0(), jkeluar=new Times0();
    double lama, biaya, biayaperjam=2000;

    void baca() {
        Scanner sc =new Scanner(System.in);
        System.out.println("input jam masuk: ");
        jmasuk.baca();
        System.out.println("input jam keluar: ");
        jkeluar.baca();
        LamaParkir();
        HitungBiaya();

    }

    void tulis() {
        System.out.println("jam masuk: ");
        jmasuk.tulis();
        System.out.println("jam keluar: ");
        jkeluar.tulis();
        System.out.println("lama parkir: "+lama+" jam");
        System.out.println("biaya parkir: "+biaya);
    }

    void LamaParkir() {
        int totalmasuk = jmasuk.totaldetik();
        int totalkeluar = jkeluar.totaldetik();
        int totallama = totalkeluar - totalmasuk;
        lama = (double) totallama / 3600;
    }

    void HitungBiaya() {
        biaya = lama * biayaperjam;
    }

    public static void main(String[] args) {
        Parkir P = new Parkir();
        P.baca();
        P.tulis();
    }
}
