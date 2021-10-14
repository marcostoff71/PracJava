/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto18pilaestatica;

import java.util.Scanner;

public class Pila {
    
    Scanner teclado = new Scanner(System.in);
    int pila1[]=new int[5];
    int tope=-1;
 
    public int push(){
 
        if(tope>=pila1.length-1){
            System.out.println("la pila está llena");
        }else
        {
            tope+=1;
            System.out.println("ingrese el dato");
            pila1[tope]=teclado.nextInt();
        }
        return tope;

    }
     public int pop(){
 
        if(tope==-1){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("Se elimino un elemento de la pila");
            pila1[tope]=0;
            tope=-1;
        }
        return tope;
    }
 
    public void ver(){
 
        for(int tope=4;tope>=0;tope--){
            System.out.println("Datos de la pila: "+pila1[tope]);
        }
    }
}
