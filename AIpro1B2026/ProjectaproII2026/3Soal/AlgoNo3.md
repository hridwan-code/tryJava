Mencari elemen terbesar pertama dan kedua

PROCEDURE DuaTerbesar(A, n)
    terbesar1 ← -∞
    terbesar2 ← -∞
    FOR i ← 1 TO n DO
        IF A[i] > terbesar1 THEN
            terbesar2 ← terbesar1
            terbesar1 ← A[i]
        ELSE IF A[i] > terbesar2 THEN
            terbesar2 ← A[i]
        ENDIF
    ENDFOR
    OUTPUT terbesar1, terbesar2
ENDPROCEDURE