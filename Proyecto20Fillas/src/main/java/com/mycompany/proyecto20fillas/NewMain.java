/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto20fillas;
import java.util.*;
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
       FilaDinamica<String> filaPalabras= new FilaDinamica<>();
       Scanner scan = new Scanner(System.in);
       
       int op;
       do{
           System.out.println("1.- Agregar un elemento a la fila");
           System.out.println("2.- Eliminar un elemento de la fila");
           System.out.println("3.- Mostrar elementos de la fila");
           System.out.println("4.- Contar elementos de la fila");
           System.out.println("5.- Vaciar fila");
           System.out.println("0.- Salir");
           System.out.println("Seleciona una opcion: ");
           op=scan.nextInt();
           String aux;
           if(op==1){
               do{
                System.out.println("Ingresa la palabra a insertar");
                aux=scan.nextLine().trim();   
               }while(aux.isEmpty());
               
               filaPalabras.agregar(aux);
                
           }else if(op==2){
               if(!filaPalabras.vacio()){
                   System.out.println("Elemento eliminado: "+filaPalabras.eliminar());
               }else{
                   System.out.println("Fila vacia");
               }
               
           }else if(op==3){
               if(!filaPalabras.vacio()){
                   filaPalabras.mostrar();
               }else{
                   System.out.println("Fila vacia");
               }
           }else if(op==4){
               System.out.println("La fila tiene: "+filaPalabras.count()+" elementos");
           }else if(op==5){
               filaPalabras.vaciar();
               System.out.println("Fila vaciada");
           }else{
               System.out.println("Seleciona una opcion correcta");
           }
           
           
       }while(op!=0||op<0||op>5);
       
    }
    
}
