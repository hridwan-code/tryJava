class Mahasiswa:
    def __init__(self):
        self.nrp = ""
        self.nama = ""
        self.ang = ""
        self.jrs = ""


PP = Mahasiswa()

PP.nrp = input("Input NRP : ")
PP.nama = input("Input Nama : ")
PP.ang = input("Input Angkatan : ")
PP.jrs = input("Input Jurusan : ")

print("\nDATA MAHASISWA")
print("NRP      :", PP.nrp)
print("Nama     :", PP.nama)
print("Angkatan :", PP.ang)
print("Jurusan  :", PP.jrs)