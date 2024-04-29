package Percobaan_2;

public class gudang30 {
    barang30[] tumpukan;
    int size, top;

    public gudang30(int kapasitas) {
        size = kapasitas;
        tumpukan = new barang30[size];
        top = -1;
    }
    public String KonversiDesimalKeBiner(int kode){
        StackKonversi30 stack = new StackKonversi30();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode /2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
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
            System.out.println("Kode Unik dalam Biner " + KonversiDesimalKeBiner(delete.kode));
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
            for (int i = top; i >= 0; i--) {
                System.out.printf("kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}
