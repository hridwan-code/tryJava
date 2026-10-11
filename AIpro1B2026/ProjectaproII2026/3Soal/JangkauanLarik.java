public class JangkauanLarik {
      static int range(int[] A) {
        int terkecil = A[0];
        int terbesar = A[A.length - 1];
        return terbesar - terkecil;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10};
        System.out.println("Range: " + range(A));
    }
}

