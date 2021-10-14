/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto11;

/**
 *
 * @author MARCO
 */
public class NewMain {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=0,b=1,c=0;
        
        
        int numFibo=6;
        
        for(int i=0;i<numFibo;i++){
            c=a+b;
            a=b;
            b=c;
            
        }
        System.out.println("Programa de fibonacci con iteracion");
        System.out.println("Marco Antonio Gonzalez Castelan");
        System.out.println(c);
        
    }
    
}
