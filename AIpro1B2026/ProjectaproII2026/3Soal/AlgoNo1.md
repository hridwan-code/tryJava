Mencari nilai X dalam larik x

PROCEDURE CariX(A, n, X)
    indeks ← 0
    
    FOR i ← 1 TO n DO
        IF A[i] = X THEN
            indeks ← i
        ENDIF
    ENDFOR

    RETURN indeks
ENDPROCEDURE