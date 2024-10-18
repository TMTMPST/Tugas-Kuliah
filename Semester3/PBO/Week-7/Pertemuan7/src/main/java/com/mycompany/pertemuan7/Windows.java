/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan7;

/**
 *
 * @author vidoe
 */
public class Windows extends Laptop{
    public String fitur;

    public Windows() {
    }

    public Windows(String merk, int kecProcesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProcesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        tampilLaptop();
        System.out.println("Fitur : " + fitur);
    }
}
 