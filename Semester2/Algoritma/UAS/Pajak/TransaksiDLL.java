public class TransaksiDLL {
    TransaksiPajak head;
    TransaksiPajak tail;

    public void tambahTransaksi(TransaksiPajak transaksi) {
        if (head == null) {
            head = tail = transaksi;
        } else {
            tail.next = transaksi;
            transaksi.prev = tail;
            tail = transaksi;
        }
    }

    public void TampilkanTransaksi() {
        TransaksiPajak current = head;
        while (current != null) {
            System.out.println("Kode: " + current.kode + ", Nominal Bayar: " + current.nominalBayar + 
                            ", Denda: " + current.denda + ", Bulan Bayar: " + current.bulanBayar + 
                            ", Kendaraan: " + current.kendaraan.noTNKB + ", Pemilik: " + current.kendaraan.nama);
            current = current.next;
        }
    }

    public void tampilkanKendaraan() {
        TransaksiPajak current = head;
        while (current != null) {
            System.out.println("TNKB: " + current.kendaraan.noTNKB + ", Nama: " + current.kendaraan.nama + 
                            ", Jenis: " + current.kendaraan.jenis + ", CC: " + current.kendaraan.cc + 
                            ", Tahun: " + current.kendaraan.tahun + ", Bulan Harus Bayar: " + current.kendaraan.bulanHarusBayar);
            current = current.next;
        }
    }

    public void cariKendaraan(String noTNKB, int bulanBayar) {
        TransaksiPajak current = head;
        while (current != null) {
            if (current.kendaraan.noTNKB.equals(noTNKB)) {
                System.out.println("TNKB: " + current.kendaraan.noTNKB + ", Nama: " + current.kendaraan.nama + 
                                ", Jenis: " + current.kendaraan.jenis + ", CC: " + current.kendaraan.cc + 
                                ", Tahun: " + current.kendaraan.tahun + ", Bulan Harus Bayar: " + current.kendaraan.bulanHarusBayar);
                System.out.println("Nominal Bayar: " + current.nominalBayar + ", Denda: " + current.denda + 
                                ", Bulan Bayar: " + current.bulanBayar + ", Kode: " + current.kode);
                return;
            }
            current = current.next;
        }
        System.out.println("Kendaraan tidak ditemukan.");
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            TransaksiPajak current = head;
            while (current.next != null) {
                if (current.kendaraan.nama.compareTo(current.next.kendaraan.nama) > 0) {
                    // Swap nodes
                    Kendaraan tempKendaraan = current.kendaraan;
                    long tempNominalBayar = current.nominalBayar;
                    long tempDenda = current.denda;
                    int tempBulanBayar = current.bulanBayar;
                    
                    current.kendaraan = current.next.kendaraan;
                    current.nominalBayar = current.next.nominalBayar;
                    current.denda = current.next.denda;
                    current.bulanBayar = current.next.bulanBayar;
                    
                    current.next.kendaraan = tempKendaraan;
                    current.next.nominalBayar = tempNominalBayar;
                    current.next.denda = tempDenda;
                    current.next.bulanBayar = tempBulanBayar;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    
}

