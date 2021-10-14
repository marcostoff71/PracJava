/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stacks;

/**
 *
 * @author MARCO
 */
public class Pila<T> {
    
    class Nodo{
        public T dato;
        public Nodo siguiente;
    }
    private Nodo raiz;
    public Pila(){
        this.raiz=null;
    }
    
    public void Aplilar(T item){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato=item;
        nuevoNodo.siguiente=raiz;
        raiz=nuevoNodo;
    }
    public T Desapilar(){
        T dato=null;
        if(raiz!=null){
            dato=(T) raiz.dato;
            raiz=raiz.siguiente;
        }else{
            
        }
        
        return dato;
    }
    
    
}
