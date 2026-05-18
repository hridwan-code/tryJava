package AIpro1B2026.Modularitas;

import java.util.Scanner;

public class PersegiPanjang {
    Titik0 kia=new Titik0(), kia2=new Titik0(), kaa=new Titik0(), kib=new Titik0();
    double panjang, lebar, tinggi;
    double luas, keliling;
    
    void baca() {
        Scanner sc= new Scanner(System.in);
        System.out.print("input panjang: "); panjang = sc.nextDouble();
        System.out.print("input lebar: "); lebar = sc.nextDouble();
        System.out.print("input tinggi: "); tinggi = sc.nextDouble();
        luas=panjang*lebar;
        keliling=2*panjang+2*lebar;
    }

    void bacaTitik() {
        Scanner sc= new Scanner(System.in);
        System.out.println("input titik kiri atas: ");
        kia.baca();
        System.out.println("input titik kanan bawah: ");
        kib.baca();
        kia2.x=kib.x;
        kia2.y=kia.y;
        kaa.x=kia.x;
    }

    void tulis() {
        System.out.println("Persegi Panjang: ");
        System.out.println("Persegi Panjang: "
        );
    }

    void tulis2() {
        System.out.println("Titik Kiri Atas: ");
        kia.tulis();
        System.out.println("Titik Kanan Bawah: ");
        kib.tulis();
        System.out.println("Titik Kiri Bawah: ");
        kaa.tulis();
        System.out.println("Persegi Panjang: ");
        kia2.tulis();
    }

    public static void main(String[] args) {
        PersegiPanjang PP = new PersegiPanjang();
        PP.baca();
        PP.tulis();
        PP.bacaTitik();
        PP.tulis2();
    }
}
