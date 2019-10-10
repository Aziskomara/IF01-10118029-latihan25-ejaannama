/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan25;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program ejaan nama
 */
public class Latihan25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nama depan anda untuk dieja =");
        String nama = input.nextLine();
        System.out.println("Ejaan Dari nama dari " +nama+ "adalah");
        
        for(int i=0;i < nama.length();i++){
            System.out.println("Huruf ke- "+(i+1)+" : "+nama.charAt(i));
        }
    }
    
}
