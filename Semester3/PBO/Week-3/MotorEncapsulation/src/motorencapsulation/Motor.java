/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorencapsulation;

/**
 *
 * @author vidoe
 */
public class Motor {

    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if (kontakOn == true) {
            kecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa ditambah karena Mesin lagi Mati");
        }
    }
    
    public void kurangiKecepatan(){
        if (kontakOn == true) {
            kecepatan -= 5;
        } else if(kecepatan == 0){
            System.out.println("Kecepatan tidak bisa dikurangi karena kecepatan 0");
        } else {
            System.out.println("Kecepatan tidak bisa dikuranig karena mesin mati");
        }
    }
    
    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kotak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
