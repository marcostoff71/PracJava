/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica1;

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
        
        ImprimeNombre("marco", 10);
        
    }
    public static void ImprimeNombre(String nombre,int veces){
        
        if(veces<=1){
            System.out.println("Tu nombre es: "+nombre);
        }else{
            System.out.println("Tu nombre es: "+nombre);
            ImprimeNombre(nombre, veces-1);
        }
        
    }
    
}
