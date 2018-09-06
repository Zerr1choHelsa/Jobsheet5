/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author User
 */
public class TryCatchFinally {
     public static void main(String[] args) {
        try{
      
           int angka = 10;
           int hasil = angka/2;
           System.out.println(hasil);
        }catch(ArithmeticException ex){
            
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
        }finally{
            
            System.out.println("Program Diakhiri");
        }
    }
    
}
