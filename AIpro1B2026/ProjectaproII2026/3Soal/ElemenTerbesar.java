public class ElemenTerbesar {
      static void duaTerbesar(int[] A) {
        int terbesar1 = Integer.MIN_VALUE;
        int terbesar2 = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > terbesar1) {
                terbesar2 = terbesar1;
                terbesar1 = A[i];
            } else if (A[i] > terbesar2) {
                terbesar2 = A[i];
            }
        }
        System.out.println("Terbesar pertama: " + terbesar1);
        System.out.println("Terbesar kedua: " + terbesar2);
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 2, 10, 6};
        duaTerbesar(A);
    }
}

