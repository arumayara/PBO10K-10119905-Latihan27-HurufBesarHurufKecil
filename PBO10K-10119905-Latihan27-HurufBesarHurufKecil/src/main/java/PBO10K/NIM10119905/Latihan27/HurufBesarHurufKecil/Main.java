/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan27.HurufBesarHurufKecil;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program merubah Huruf menjadi besar dan kecil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner (System.in);
        String kalimat;
        
        System.out.println("Masukan Kalimat : ");
        kalimat = scanner.nextLine();
        
        System.out.println("======= Hasil Formating (\"=======");
        System.out.println("Huruf Besar : ".concat(kalimat.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(kalimat.toLowerCase()));
        
        
    }
    
}
