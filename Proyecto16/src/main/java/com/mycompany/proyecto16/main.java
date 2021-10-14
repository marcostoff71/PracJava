/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto16;
import java.util.Scanner;
/**
 *
 * @author MARCO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Programa de torres de hanoi ");
        System.out.println("Marco Antonio Gonzalez Castelan");
        do{
            System.out.println("Ingrese el numero de discos: ");
            n = sc.nextInt();
        
            if(n<1)System.out.println("Ingresa un numero mayor o igual a 1");
        }while(n<1);
        
        torresHanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino
    }
    //Método Torres de Hanoi Recursivo
public static void Hanoi(int n, int origen,  int auxiliar, int destino){
  if(n==1)
  System.out.println("mover disco de " + origen + " a " + destino);
  else{
     Hanoi(n-1, origen, destino, auxiliar);
     System.out.println("mover disco de "+ origen + " a " + destino);
     Hanoi(n-1, auxiliar, origen, destino);
     
   }
}
   

public static void torresHanoi(int discos, int torre1, int torre2, int torre3){
        // Caso Base
     
        if (discos==1){
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
        } else {
            // Dominio
         
            // Llamamos a la función de tal forma que decrementamos
            // el número de discos, y seguimos el algoritmo
            // (origen, destino, auxiliar)
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
            // En esta ocasión siguiendo el algoritmo hacemos lo siguiente
            // (auxiliar, origen, destino)
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
     
    }
}