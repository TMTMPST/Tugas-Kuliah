/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demohp;

/**
 *
 * @author vidoe
 */
public class HandPhone {
    private String noSeri, model, versiOs;
    private boolean on = false;
    private int volume = 0;
    private int prevVol;
    
    public HandPhone(String noSeri, String model, String versiOs){
        this.model = model;
        this.noSeri = noSeri;
        this.versiOs = versiOs;
    }
    
    public HandPhone(){
        
    }
    
    public void power(){
        on = !on;
        if (on){
            System.out.println("HandPhone is ON.");
        } else {
            System.out.println("HandPhone is OFF.");
        }
    }
    
    public void tambahVolume(){
        if (on && volume < 100){
            volume+= 10;
            System.out.println("Volume : " + volume);
        } else if (!on){
            System.out.println("Handphone OFF");
        } else {
            System.out.println("Volume Full");
        }
    }
    
    public void kurangVolume(){
        if (on && volume > 0){
            volume-=10;
            System.out.println("Volume : " + volume);
        } else if (!on){
            System.out.println("HandPhone OFF");
        } else {
            System.out.println("Volume Empty");
        }
    }
    
    public void mute(){
        if (on) {
            if (volume > 0) {
                prevVol = volume;
                volume = 0;
                System.out.println("volume : " + volume + " (Muted)");
            } else {
                volume = prevVol;
                prevVol = volume;
                System.out.println("volume : " + volume + " (Unmuted)");

            }
        }
    }
    
    public void info(){
        System.out.println("No Seri : " + noSeri);
        System.out.println("Model : " + model);
        System.out.println("VersiOs : " + versiOs);
        System.out.println("Power : " + on);
        System.out.println("Volume : " + volume);
    }
}

