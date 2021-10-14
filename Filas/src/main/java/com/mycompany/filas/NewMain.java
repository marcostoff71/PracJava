/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filas;

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
        Fila<String> fila = new Fila<>();
        fila.Agregar("hola1");
        fila.Agregar("hola2");
        fila.Agregar("hola3");
        fila.Agregar("hola4");
        
        System.out.println(fila.Eliminar());
        System.out.println(fila.Eliminar());
        System.out.println(fila.Eliminar());
        System.out.println(fila.Eliminar());
        System.out.println(fila.Eliminar());
    }
    
}
