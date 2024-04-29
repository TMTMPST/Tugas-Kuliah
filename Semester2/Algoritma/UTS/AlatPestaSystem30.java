package UTS;

public class AlatPestaSystem30 {
    AlatPesta30[] listAlat30 = new AlatPesta30[3];
    int idx30;

    void tambah30(AlatPesta30 h){
        if (idx30 < listAlat30.length) {
            listAlat30[idx30] = h;
            idx30++;
        } else {
            System.out.println("Data sudah penuh");
        }

    }

    void tampil30(){
        for (AlatPesta30  alat30 : listAlat30) {
            System.out.println("Nama        : " + alat30.nama30);
            System.out.println("Kategori    : " + alat30.kategori30);
            System.out.println("Harga       : " + alat30.harga30);
            System.out.println("Stok        : " + alat30.stok30);
            System.out.println("=======================================");
        }
    }

    void bubbleSort30(){
        for (int i = 0; i < listAlat30.length-1; i++) {
            for (int j = 1; j < listAlat30.length-i; j++) {
                if (listAlat30[j].harga30 < listAlat30[j-1].harga30) {
                    AlatPesta30 temp = listAlat30[j];
                    listAlat30[j] = listAlat30[j - 1];
                    listAlat30[j-1] = temp;
                }
                
            }
            
        }
    }

    int sort30(String cari30){
        int posisi30 = -1;
        for (int i = 0; i < listAlat30.length; i++) {
            if (listAlat30[i].nama30.toLowerCase().contains(cari30.toLowerCase())) {
                posisi30 = i;
            }
        }
        return posisi30;
    }



    public void tampilData30(String x30, int pos30) {
        if (pos30!= -1) {
            System.out.println("nama        : " + x30);
            System.out.println("kategori    : " + listAlat30[pos30].kategori30);
            System.out.println("harga       : " + listAlat30[pos30].harga30);
            System.out.println("stok        : " + listAlat30[pos30].stok30);
        }
    }
}
