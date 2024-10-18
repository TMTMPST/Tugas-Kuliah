/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vidoe
 */
public class HandPhone {
    private String noSeri, model, versiOs;
    private boolean on = false;
    private int volume = 0;
    
    public void power(){
        on = !on;
        System.out.println("Handphone is on ?" + on);
    }
    
    public void tambahVolume(){
        if (on && volume < 100){
            volume++;
        }
    }
    
    public void kurangVolume(){
        if (on && volume > 0){
            volume--;
    }
    
    public void mute(){
        if (on){
            volume = 0;
        }
        System.out.println("Volume Muted");
    }
    
    public void info(){
        System.out.println("No Seri :");
        System.out.println("Mode : ");
        System.out.println("VersiOs :");
    }
}
