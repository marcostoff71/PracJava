/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto5;

import java.util.Scanner;

/**
 *
 * @author MARCO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int op=0, tam=0;
        int vec[]=null;
        
        System.out.println("Marco Antonio Gonzalez Castelan");
        System.out.println("Practica de vectores");
        do{
            menu();
            System.out.println("Seleciona una opcion");
            do{
                op=scan.nextInt();
                if(op<0||op>3){
                    System.out.println("Seleciona una opcion disponible");
                }
            }while(op<0||op>3);
            
            switch(op){
                case 1:
                    do{
                        System.out.println("Ingresa el tamaño del vector: ");
                    tam=scan.nextInt();
                    }while(tam<0);
                     vec= new int[tam];
                    
                    break;
                case 2:
                    if(vec!=null){
                       for(int i=0;i<vec.length;i++){
                           System.out.println((i+1)+".- Ingresa el valor:");
                           vec[i]=scan.nextInt();
                       }
                    }
                    break;
                case 3:
                    if(vec!=null){
                        
                        System.out.print("[");
                        for(int i=0;i<vec.length;i++){
                           if(i!=vec.length-1){
                               System.out.print(vec[i]+",");
                           }else{
                               System.out.print(vec[i]);
                           }
                        }
                        System.out.println("]");
                    }
                    break;
            }
            
            
            
            
            
        }while(op!=0);
        
    }
    public static void menu(){
        System.out.println("1.- Crear vector");
        System.out.println("2.- LLenar vector");
        System.out.println("3.- Imprimir vecto");
        System.out.println("0.- Salir");
    }
    
}
