/*Buatlah algoritma dalam Bahasa Java Anda akan diberi hadiah jika rangking 1 dikelas
dan naik kelas, yang dapat ditulis sebagai ekspresi: (rangking == 1) && (naikKelas)*/

package hadiah;

import java.util.Scanner;

public class Hadiah {

    public static void main(String[] args) {
        Scanner hadiah = new Scanner(System.in);
        System.out.print("Masukkan Peringkat :  ");
        int rank = hadiah.nextInt();
        System.out.print("Apakah kamu naik kelas? (naik/tidak): ");
        String naikKelasInput = hadiah.next();

        boolean naikKelas = naikKelasInput.equalsIgnoreCase("naik");

        if (rank == 1 && naikKelas) {
            System.out.println("Horee! Kamu dapat hadiah karena ranking pertama dan naik kelas");
        } else {
            System.out.println("Yah coba lagi, Kamu tidak memenuhi syarat untuk dapat hadiah");
        }
    }
    
}
