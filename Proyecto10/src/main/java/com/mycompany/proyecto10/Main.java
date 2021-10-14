/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto10;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static int sumaEnteros(int num){
        if(num==1){
            return 1;
        }else{
            return num+sumaEnteros(num-1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int suma=sumaEnteros(10);
        System.out.println("Programa de recursividad");
        System.out.println("Suma de enteros de n numeros: "+suma);
    }
    
}
