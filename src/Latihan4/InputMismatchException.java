/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class InputMismatchException {
        public static void main(String args[])
    {
        //int a=100;
        System.out.println("Masukkan nilai a");
         Scanner console = new Scanner(System.in);
	int a = console.nextInt();
     
        System.out.println("Masukkan nilai b");
	int b = console.nextInt();
        double res=a/b;
        System.out.println(" Hasilnya adalah : "+res);  
    }

}
