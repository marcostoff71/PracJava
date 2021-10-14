/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto9;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void decrementaNumeros(int num){
        
        if(num>0){
            System.out.println(num);
            decrementaNumeros(num-1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Programa de recursividad");
        System.out.println("Programa que decrementa numeros");
        decrementaNumeros(9);
    }
    
}
