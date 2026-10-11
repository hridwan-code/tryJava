public class NilaiXLarik {
      static int cariX(int[] A, int X) {
        int indeks = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == X) {
                indeks = i + 1;
            }
        }
        return indeks;
    }

    public static void main(String[] args) {
        int[] A = {4, 7, 2, 7, 9};
        int X = 7;
        System.out.println("Indeks terakhir: " + cariX(A, X));
    }
}

