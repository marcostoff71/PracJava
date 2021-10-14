/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto18pilaestatica;
import java.util.*;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int seleccion;
        Scanner opcion = new Scanner(System.in);
        Pila objeto= new Pila();
         do
        {
 
          System.out.println("Menu de pila de tamaño 5 de Nombre:()");
          System.out.println("1. Push (Ingresar)");
          System.out.println("2. Pop(quitar)");
          System.out.println("3. Mostrar completa");
          System.out.println("4. Salida");
 
          System.out.println("Teclee la opcion");
          seleccion=opcion.nextInt();
 
          switch(seleccion){
              case 1:
                  objeto.push();
                  break;
              case 2:
                  objeto.pop();
                  break;
              case 3:
                  objeto.ver();
                  break;
              default:
                  System.out.println("Error\nOpcion invalida");
          }
 
        }while(seleccion!=4);
 

    }
    
}
