package com.mycompany.proyecto3;

import java.util.*;

/*
            ----Marco Antonio---
*/
public class Principal {
    public static void main(String[] args) {

        String nombre;
        int anioNaci,anioActual,edad;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Porgrama de nombre y calcula de edad");
        System.out.println("Ingresa tu nomnre:");
        nombre=scan.nextLine();
        
        System.out.println("Ingresa el año en que naciste: ");
        anioNaci=scan.nextInt();
        anioActual=2021;
        
        edad=anioActual-anioNaci;
        
        System.out.println("Tu nombre es: "+nombre+" tienes "+edad+" años");
        
        
    }
    
}
