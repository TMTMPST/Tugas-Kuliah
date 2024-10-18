/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan7;

/**
 *
 * @author vidoe
 */
public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String merk, int kecProcesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProcesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }
    
    public void tampilMac(){
        tampilLaptop();
        System.out.println("Security : " + security);
    }
    
}
