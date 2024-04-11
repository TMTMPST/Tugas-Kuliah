package Latihan;

public class HotelSevice {
    Hotel[] listHtl = new Hotel[5];
    int idx;

    void tambah(Hotel h){
        if (idx < listHtl.length) {
            listHtl[idx] = h;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampilAll(){
        for (Hotel hotel : listHtl) {
            System.out.println("Nama    : " + hotel.nama);
            System.out.println("Kota    : " + hotel.kota);
            System.out.println("Harga   : " + hotel.harga);
            System.out.println("Bintang : " + hotel.bintang);
            System.out.println("========================");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listHtl.length-1; i++) {
            for (int j = 1; j < listHtl.length-i; j++) {
                if (listHtl[j].harga < listHtl[j - 1].harga) {
                    Hotel temp = listHtl[j];
                    listHtl[j] = listHtl[j - 1];
                    listHtl[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listHtl.length-1; i++) {
            int idxMin = i;
            for (int j = i; j < listHtl.length; j++) {
                if (listHtl[j].bintang < listHtl[idxMin].bintang) {
                    idxMin  = j;
                }

                Hotel temp = listHtl[j];
                listHtl[j] = listHtl[idxMin];
                listHtl[idxMin] = temp;

            }
        }
    }
}

