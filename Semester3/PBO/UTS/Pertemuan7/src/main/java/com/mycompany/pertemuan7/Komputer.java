/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan7;

/**
 *
 * @author vidoe
 */
public class Komputer {
    public String merk, jnsProsesor;
    public int kecProcesor, sizeMemory;

    public Komputer() {
    }

    public Komputer(String merk, int kecProcesor, int sizeMemory,  String jnsProsesor) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProcesor = kecProcesor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilData(){
        System.out.println("Merk        : " + merk);
        System.out.println("Jns Proc    : " + jnsProsesor);
        System.out.println("Kec Proc    : " + kecProcesor);
        System.out.println("Size Memory : " + sizeMemory);
    }
}
