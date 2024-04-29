package Percobaan_3;

import java.util.Scanner;

public class PostFixMain30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekpresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        
        PostFix30 post = new PostFix30(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    }
}
