/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance1;

/**
 *
 * @author vidoe
 */
public class Staff extends Karyawan{
    public int lembur, potongan;

    public Staff() {
    }

    public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur : " + lembur);
        System.out.println("Potongan : " + potongan);
        System.out.println("Total Gaji : " + (gaji + lembur - potongan));
    }
    
    
}
