package AIpro1B2026;

import java.util.Scanner;

public class Kelipatan4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("20: ");
        int n = input.nextInt();
        if (n % 4 == 0) {
            System.out.println("MULTIPLE OF 4");
        } else {
            System.out.println("NOT MULTIPLE OF 4");
        }
        input.close();
    }
}