package AIpro1B2026.Modularitas;

import java.util.Scanner;

public class Titik0 {
    double x, y;

    void baca() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input x: ");x = sc.nextDouble();
        System.out.print("input y: ");y = sc.nextDouble();  
    }

    void tulis() {
        System.out.println("Titik = "+"<"+x+","+y+">");
    }

    Titik0 TitikTengah(Titik0 T1, Titik0 T2) {
        Titik0 Ttengah = new Titik0();
        
        Ttengah.x = (T1.x + T2.x) / 2;
        Ttengah.y = (T1.y + T2.y) / 2;
        return Ttengah;

    }
    Titik0 TitikTengah(Titik0 T1, Titik0 T2, Titik0 T3) {
        Titik0 TT = new Titik0();
        
        TT.x = (T1.x + T2.x + T3.x) / 3;
        TT.y = (T1.y + T2.y + T3.y) / 3;
        return TT;

    }

    public static void main(String[] args) {
        Titik0 T1 = new Titik0();
        Titik0 T2 = new Titik0();
        Titik0 T3 = new Titik0();

        T1.baca();
        T1.tulis();
        T2.baca();
        T2.tulis();
        T3=T3.TitikTengah(T1, T2);

        T3.tulis();
    }   

}
