Diberikan larik integer A yang berukuran n elemen. larik A sudah terddefinisi elemen elemennya tuliskan prosedur untuk mencari nilai X di dalam larik, dengan parameter keluaran adalah indeks dari kemunculan terakhir elemen X. jika X tidak terdapat di dalam larik, prosedur mengeluarkan indeks -1


Mencari nilai X dalam larik x

PROCEDURE CariX(A, n, X)
    indeks ← -1 / 0
    
    FOR i ← 1 TO n DO
        IF A[i] (=/) X THEN
            indeks ← i
        ENDIF
    ENDFOR

    RETURN indeks
ENDPROCEDURE