package Percobaan_1;

public class gudang30 {
    barang30[] tumpukan;
    int size, top;

    public gudang30(int kapasitas) {
        size = kapasitas;
        tumpukan = new barang30[size];
        top = 1;
    }
    
    public boolean cekKosong(){
        if (top == 1) {
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
    
    public void tambahBarang(barang30 hrg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = hrg;
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

    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang: ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}
