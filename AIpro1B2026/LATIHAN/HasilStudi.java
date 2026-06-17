package LATIHAN;

import java.util.Scanner;

public class HasilStudi {
    class HasiilStudi {
        String nrp;
        double uts, na, uas;
        char idx;

        void baca() {
            Scanner sc = new Scanner(System.in);
            System.out.print("nrp: ");
            nrp = sc.nextLine();
            while (nrp.isEmpty()) {
                System.out.print("NRP tidak boleh kosong. Masukkan lagi: ");
                nrp = sc.nextLine();
            }
            System.out.print("Nilai UTS: ");
            uts = sc.nextDouble();
            while (uts<0 || uts>100) {
                System.out.print("Nilai UTS harus antara 0 dan 100. Masukkan lagi: ");
                uts = sc.nextDouble();
            }
            System.out.print("Nilai NA: ");
            na = sc.nextDouble();
            while (na<0 || na>100) {
                System.out.print("Nilai NA harus antara 0 dan 100. Masukkan lagi: ");
                na = sc.nextDouble();
            }
            System.out.print("Nilai UAS: ");
            uas = sc.nextDouble();
            while (uas<0 || uas>100) {
                System.out.print("Nilai UAS harus antara 0 dan 100. Masukkan lagi: ");
                uas = sc.nextDouble();
            }
            hitungNA();
            idx();
        }
        void tulis(){
            System.out.println("Hasil Studi = "+nrp+" UTS: "+uts+" NA: "+na+" UAS: "+uas+" Index: "+idx);
        }
        void hitungNA(){
            na=0.35*uts+0.35*na+0.3*uas;
        }
        void idx(){
            if (na>=80) {
                idx='A';
            } else if (na>=70) {
                idx='B';
            } else if (na>=60) {
                idx='C';
            } else if (na>=50) {
                idx='D';
            } else {
                idx='E';
            }
        }
    }
}
