package LARIK;

import java.util.Scanner;

class NonArray {
	int N = 5;
	int a = 0;
	public static void main(String[] args) {
		int N = 5;
		int[] a = new int[N];

		Scanner sc = new Scanner(System.in);
		for (int i=0; i<N; i++) {
			System.out.print("input elemen ke: "+i+"  ");
			a[i] = sc.nextInt();
		}
		for (int i=0; i<N; i++) {
			System.out.println("input elemen ke: "+i+"adalah "+a[i]);
		}
	}
} 
