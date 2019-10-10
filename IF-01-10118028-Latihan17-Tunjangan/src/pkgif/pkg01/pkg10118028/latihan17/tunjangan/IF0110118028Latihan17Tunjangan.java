/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118028.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Tunjangan
 */
public class IF0110118028Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan ? : Rp. ");
        int GajiPokok = input.nextInt();
        System.out.print("Status Anda ? (Menikah/Belum) \t:");
        String Status = input.next();
        int Tunjangan;
        int TotalGaji;
        if (Status.equalsIgnoreCase("Menikah")) {
            Tunjangan = GajiPokok * 35/100;
            TotalGaji = GajiPokok + Tunjangan;
         
        }else {
            Tunjangan = 0;
            TotalGaji = GajiPokok + Tunjangan;
            
        }
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok  : " +GajiPokok);
        System.out.println("Tunnjangan  : " +Tunjangan);
        System.out.println("Total Gaji  : " +TotalGaji);
        System.out.println("(Developed by : Surya Fakhriy Hasbi)");
    }
    
}
