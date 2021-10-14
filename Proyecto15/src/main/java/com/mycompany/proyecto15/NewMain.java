package com.mycompany.proyecto15;

import java.util.*;
public class NewMain {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        char letra='A';
        Scanner scan = new Scanner(System.in);
        System.out.println("Progama de letras");
        System.out.println("Marco Antonio Gonzalez Castelan 20100033");
        do{
            System.out.println("Ingresa una letra despues de la A: ");
            letra=scan.next().toUpperCase().charAt(0);
            
        }while(letra<='A');
   
        MuestraLetras(letra);
        metodoA(letra);
    }
    public static void MuestraLetras(char simbo){
        if(simbo>='A'){
            MuestraLetras((char)(((int)simbo)-1));
            System.out.print(simbo);
        }
    }
    public static void metodoA(char simbo){
        
        if('A'<=simbo){
            metodoB(simbo);
            System.out.print(simbo);
        }
    }
    public static void metodoB(char c){
        c--;
        metodoA(c);
    }
}
    

