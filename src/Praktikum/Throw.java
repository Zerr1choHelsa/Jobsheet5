/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Throw {
     public static void main(String[] args){
        //Membuat Instance Scanner Untuk Input Data
        Scanner input = new Scanner(System.in);
        int bebek;
        System.out.println("Wildan Tolong Bawakan 2 Ekor Bebek Dikandang");
        try{
            System.out.print("Jumlah Bebek Yang Ingin Dibawa: ");
            bebek = input.nextInt(); //Mendapatkan Input Dari User
            if(bebek > 2){
                //Jika Bebek Yang Kita Bawa lebih dari 2, maka akan terjad error
                throw new Exception("Terjadi Kesalahan  Nih!");
            }else{
                System.out.println("Aman-Aman Saja");
            }
        }catch(Exception e){
            //Menampilkan Pesan Kesalahan
            e.printStackTrace();
        }
    }
    
}
