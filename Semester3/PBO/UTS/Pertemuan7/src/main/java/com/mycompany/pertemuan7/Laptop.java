/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan7;

/**
 *
 * @author vidoe
 */
public class Laptop extends Komputer{
    public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String merk, int kecProcesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProcesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLaptop(){
        tampilData();
        System.out.println("Jns Batrei : " + jnsBatrei);
    }
}
