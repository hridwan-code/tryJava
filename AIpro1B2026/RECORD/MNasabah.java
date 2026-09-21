package RECORD;

import java.util.Scanner;

public class MNasabah {
  
    String norek, nama;
    double saldo;

  void baca() {
      Scanner sc= new Scanner(System.in);
      System.out.print("input no rekening:");norek=sc.next();
      System.out.print("input nama:");nama=sc.next();
      System.out.print("input saldo:");saldo=sc.nextDouble();

    }
    void tampil() {
      System.out.print("Mahasiswa:"+norek+" "+nama+" "+saldo);
    }

    public static void main(String[] args) {
      MNasabah R=new MNasabah();
      R.baca();
      R.tampil();

    }
}


