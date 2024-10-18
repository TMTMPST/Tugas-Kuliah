/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan7;

/**
 *
 * @author vidoe
 */
public class Pc extends Komputer{
    public int ukuranMotor;

    public Pc() {
    }

    public Pc(String merk, int kecProcesor, int sizeMemory, String jnsProsesor, int ukuranMotor) {
        super(merk, kecProcesor, sizeMemory, jnsProsesor);
        this.ukuranMotor = ukuranMotor;
    }
    
    public void tampilPc(){
        tampilData();
        System.out.println("Ukuran Motor : " + ukuranMotor);
    }
}
