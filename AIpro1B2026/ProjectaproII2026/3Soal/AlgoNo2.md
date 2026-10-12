diberikan larik integer A yang berukuran n elemen. Elemen Elemen larik A sudah terurut menaik (dari kecil ke besar). tuliskan fungsi untuk menghitung jangkauan (range) nilai di dalam larik. Jangkauan adalah selisih nilai terbesar dengan nilai terkecil

Menghitung jangkauan (range) larik

FUNCTION Range(A, n)
    terbesar ← A[n]
    terkecil ← A[1]
    hasil ← terbesar - terkecil
    RETURN hasil
ENDFUNCTION


[6.7.20.20.30.100]

[20.50.100.6.7]
