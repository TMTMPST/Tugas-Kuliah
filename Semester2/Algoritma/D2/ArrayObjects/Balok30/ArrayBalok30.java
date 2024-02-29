package Balok30;

public class ArrayBalok30 {
    public static void main(String[] args) {
        
        Balok30[] blArray = new Balok30[3];
        blArray[0] = new Balok30 (100, 30, 12);
        blArray[1] = new Balok30 (120, 40, 15);
        blArray[2] = new Balok30 (210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-" + i + " : " + blArray[i].hitungVolume());
            System.out.println("Volume balok ke-" + i + " : " + blArray[i].luas());
        }
    }
}
