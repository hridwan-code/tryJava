package AIpro1B2026.RECORD;

import java.util.Scanner;

public class Nilai {
    String nrp;
    Double uts, uas, tugas, prak, na;
    char idx;

    void baca() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input nrp: ");
        nrp = sc.next();
        System.out.print("input uts: ");
        uts = sc.nextDouble();
        System.out.print("input uas: ");
        uas = sc.nextDouble();
        System.out.print("input tugas: ");
        tugas = sc.nextDouble();
        System.out.print("input prak: ");
        prak = sc.nextDouble();
        na = (uts * 0.3) + (uas * 0.3) + (tugas * 0.2) + (prak * 0.2);
    }

    void bacavalid() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input nrp: ");
        nrp = sc.next();
        System.out.print("input uts: ");
        uts = sc.nextDouble();
        System.out.print("input uas: ");
        uas = sc.nextDouble();
        System.out.print("input tugas: ");
        tugas = sc.nextDouble();
        System.out.print("input prak: ");
        prak = sc.nextDouble();
        na = (uts * 0.3) + (uas * 0.3) + (tugas * 0.2) + (prak * 0.2);
        SetIndex();
    }

    void SetIndex() {
        if (na >= 80) {
            idx = 'A';
        } else if (na >= 70) {
            idx = 'B';
        } else if (na >= 60) {
            idx = 'C';
        } else if (na >= 50) {
            idx = 'D';
        } else {
            idx = 'E';
        }
    }
}




