/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto7;


class Recur{
    
    public void Imprime(int veces){
        
        if(veces>0){
            
            Imprime(veces-1);
            System.out.println(veces);
        }
    }
    
    
}
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Programa de recursividad");
        System.out.println("Programa que incrementa un numero de 1 hasta n");
        Recur re= new Recur();
        re.Imprime(10);
    }
    
}
