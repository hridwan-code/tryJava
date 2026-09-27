package RECORD;

import java.util.Scanner;

public class Mahasiswa {

    String nrp, nama, ang, jrs;

    public static void main(String[] args) {

        Mahasiswa PP = new Mahasiswa();

        Scanner sc = new Scanner(System.in);

        System.out.print("input nrp : ");
        PP.nrp = sc.nextLine();

        System.out.print("input nama : ");
        PP.nama = sc.nextLine();

        System.out.print("input angkatan : ");
        PP.ang = sc.nextLine();

        System.out.print("input jurusan : ");
        PP.jrs = sc.nextLine();

        System.out.println("\nDATA MAHASISWA");
        System.out.println("NRP      : " + PP.nrp);
        System.out.println("Nama     : " + PP.nama);
        System.out.println("Angkatan : " + PP.ang);
        System.out.println("Jurusan  : " + PP.jrs);

        sc.close();
    }
}
