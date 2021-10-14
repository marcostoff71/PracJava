/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto21filaestatica;

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
        
        FilaEstatica re= new FilaEstatica();
        
        re.agregar("hola");
        re.agregar("como");
        re.agregar("estas");
        System.out.println(re.eliminar());
        System.out.println(re.eliminar());
        System.out.println(re.eliminar());
        
        re.agregar("hola");
        re.agregar("como");
        re.agregar("estas");
        System.out.println(re.eliminar());
        System.out.println(re.eliminar());
        System.out.println(re.vacia());
        System.out.println(re.eliminar());
        System.out.println(re.vacia());
        
    }
    
}
