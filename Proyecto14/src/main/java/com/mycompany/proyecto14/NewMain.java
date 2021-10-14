/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto14;

import java.util.Scanner;

/**
 *
 * @author MARCO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int num){
        int re=1;

        for(int i=num;i>=1;i--){
            re*=i;
        }
        
        return re;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int fac=0,resul=0;
        
        System.out.println("\t\t\t======Marco Antonio Gonzalez Castelan=======");
        System.out.println("Programa de Factorial");
        
        
        System.out.println("Ingresa el numero a sacar el factorial: ");
        String le=scan.nextLine();
        
        fac=Integer.parseInt(le);
        
        resul= factorial(fac);
        
        System.out.println("El Factorial de "+fac+" es: "+resul);
    }
    
}
