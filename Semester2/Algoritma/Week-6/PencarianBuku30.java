public class PencarianBuku30 {
    Buku30 listBk[] = new Buku30[3];
    int idx;

    void tambah(Buku30 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else { 
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Buku30 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(String cari) {
        int count = 0;
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.toLowerCase().contains(cari.toLowerCase())) {
                posisi = j;
                count++;
            }
        }
        if (count > 1) {
            System.out.println(count + " data ditemukan dengan judul yang sama!");
        }
        return posisi;
    }

    public static void bubbleSort(Buku30[] listBk) {
        for (int i = 0; i < listBk.length - 1; i++) {
        for (int j = 0; j < listBk.length - i - 1; j++) {
            if (listBk[j].judulBuku.compareTo(listBk[j + 1].judulBuku) > 0) {
            Buku30 temp = listBk[j];
            listBk[j] = listBk[j + 1];
            listBk[j + 1] = temp;
            }
        }
        }
    }


    public void tampilPosisi(String x, int pos){
        if (pos!= -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " Tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos!= -1) {
            System.out.println("Kode Buku \t : " + x);
            System.out.println("Judul \t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit \t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t: " + listBk[pos].pengarang);
            System.out.println("Stock \t: " + listBk[pos].stock);
        }
    }

    public int findBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            int compareResult = cari.compareTo(listBk[mid].judulBuku);
        
            if (compareResult == 0) {
            return mid;
            } else if (compareResult < 0) {
            return findBinarySearch(cari, left, mid - 1);
            } else {
            return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
        }


}
