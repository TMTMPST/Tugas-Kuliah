package Latihan;

public class gudang30 {
    barang30[] tumpukan;
    int size, top;

    public gudang30(int kapasitas) {
        size = kapasitas;
        tumpukan = new barang30[size];
        top = -1;
    }
    
    public boolean cekKosong(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean cekPenuh(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void tambahBarang(barang30 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " Berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal ! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public barang30 ambilBarang(){
        if (!cekKosong()) {
            barang30 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang. ");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public barang30 lihatBarangTeratas(){
        if (!cekKosong()) {
            barang30 barangTeratas = tumpukan[top];
            System.out.println("Barang Teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public barang30 lihatBarangTerbawah(){
        if (!cekKosong()) {
            barang30 barangTerbawah = tumpukan[0];
            System.out.println("Barang Terbawah : " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public void printBarang(int i){
        System.out.println("Barang ke : " + (i + 1) + " Nama barang : " + tumpukan[i].nama);
    }

    public void cariBarang(String cari) {
        if (cekKosong()) {
            System.out.println("Tumpukan barang kosong");
            return;
        }

        int i = cariKodeBarang(cari);
        if (i > -1) {
            printBarang(i);
        } else {
            System.out.println("Barang " + cari + " tidak ditemukan");
        }

    }

    private int cariKodeBarang(String cari) {
        int cariKode = -1;
        if (cari.matches("[0-9]+")) {
            cariKode = Integer.parseInt(cari);
        }


        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == cariKode) {
                System.out.println("Barang ditemukan");
                return i;
            }
            if (tumpukan[i].nama.equals(cari)) {
                System.out.println("Barang ditemukan");
                return i;
            }
        }
        return -1;
    }

    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}
