package AIpro1B2026.Array;

import java.util.Scanner;

class ArrayInt {
	int Nmaks = 5;//   { ukuran maksimum elemen larik }
	  int[] a= new int[Nmaks]; //ArrayInt sbg tipe data, atribut a merupakan array
	  							// integer berukuran 100 elemen
	void init() {
		for (int i=0;i<Nmaks;i++) {
			a[i]=25;
		}
	}
	void baca() {
		Scanner sc= new Scanner(System.in);
		for (int i=0;i<Nmaks;i++) {
			System.out.print("A ke "+i+"= ");
			  a[i]=sc.nextInt(); // input (A[i])
		} 
		    
	}
	void tulis() {
		for (int i=0;i<Nmaks;i++) {
			System.out.println("A ke "+i+"= "+a[i]);
		}
    }
	
	public static void main (String[] args){
		  ArrayInt A=new ArrayInt(); //{ A adalah sebuah variabel bertipe ArrayInt
		
		A.init();
		A.tulis();
		A.baca();
		A.tulis();    
		
	}
}