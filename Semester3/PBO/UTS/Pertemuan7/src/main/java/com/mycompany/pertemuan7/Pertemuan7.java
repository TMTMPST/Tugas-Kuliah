/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan7;

/**
 *
 * @author vidoe
 */
public class Pertemuan7 {

    public static void main(String[] args) {
        Mac mac = new Mac("Apple", 4, 32, "Intel", "Li-Ion", "Finger Print");
        System.out.println("Data Mac:");
        mac.tampilMac();
        System.out.println();

        Windows windows = new Windows("MSI", 4, 64, "AMD Ryzen 7 5700X", "Li-Poly", "Transformer");
        System.out.println("Data Windows:");
        windows.tampilWindows();
        System.out.println();

        Pc pc = new Pc("iBuyPower", 16, 64, "AMD Ryzen 9 9800X3D", 42);
        System.out.println("Data Pc:");
        pc.tampilPc();

    }
}
