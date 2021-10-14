/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arbol;

class Nodo{
    public int dato;
    public Nodo padre;
    public Nodo de;
    public Nodo iz;
}
public class Arbol {

    /**
     * @param args the command line arguments
     */
    private static Nodo arbol=null;
    
    public static void insertar(int dato){
        insertarNodo(arbol,dato,null);
    }
    private static void insertarNodo(Nodo insertar,int dato,Nodo padre){
        
        if(insertar==null){
            Nodo nuevo=CreaNodo(padre, dato);
            insertar=nuevo;
        }else{
            if(padre.dato<dato){
                insertarNodo(insertar.iz, dato,insertar);
            }else{
                insertarNodo(insertar.de,dato,insertar);
            }
        }
    }
    private static void postOrden(Nodo arbol){
        if(arbol==null){
            
        }else{
            System.out.println(arbol.dato+"-");
            postOrden(arbol.de);
            postOrden(arbol.iz);
        }
    }
    private static Nodo CreaNodo(Nodo insertar,int dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.padre=insertar;
        nuevoNodo.dato=dato;
        nuevoNodo.de=null;
        nuevoNodo.iz=null;
        return nuevoNodo;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        insertar(10);
        insertar(9);
        insertar(8);
        
        postOrden(arbol);
    }
    
}
