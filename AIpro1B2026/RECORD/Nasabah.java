package RECORD;

import java.util.Scanner;

public class Nasabah {
  
    String norek, nama;
    double saldo;

    public static void main(String[] args) {
      Nasabah R=new Nasabah();
      Scanner sc= new Scanner(System.in);
      System.out.print("input no rekening:");R.norek=sc.next();
      System.out.print("input nama:");R.nama=sc.next();
      System.out.print("input saldo:");R.saldo=sc.nextDouble();

      System.out.print("Mahasiswa:"+R.norek+" "+R.nama+" "+R.saldo);
    }
}
