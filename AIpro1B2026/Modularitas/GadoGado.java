package Modularitas;
import java.util.Scanner;

public class GadoGado {
    static int a, b, t;
    
    static void tukar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input A: ");
        a = sc.nextInt();
        System.out.print("Input B: ");
        b = sc.nextInt();
        System.out.println(a + "," + b);
        t = a;
        a = b;
        b = t;
        System.out.println(a + "," + b);
    }
    
    public static void main(String[] args) {
        tukar();
    }
}
