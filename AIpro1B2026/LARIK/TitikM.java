package AIpro1B2026.LARIK;

import java.util.Scanner;

public class TitikM {
    int x,y;

    void baca() {
        Scanner sc= new Scanner(System.in);
        System.out.print("input x: ");this.x = sc.nextInt();
        System.out.print("input y: ");this.y = sc.nextInt();
    }

    void tulis(){
        System.out.println("Titik = "+"<"+x+","+y+">");
    }

    public static void main (String[] args) {
        TitikM T =new TitikM();
        TitikM T2 =new TitikM();

        T.baca();
        T.tulis();
    }
}
