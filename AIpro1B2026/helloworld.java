package AIpro1B2026;

import java.util.Scanner;

public class helloworld {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ridwan: ");
        String name = sc.nextLine();
        System.out.println("hello " + name);
        sc.close();
    }
}