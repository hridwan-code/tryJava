import java.util.Scanner;

public class PolaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan N : ");
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = N; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}