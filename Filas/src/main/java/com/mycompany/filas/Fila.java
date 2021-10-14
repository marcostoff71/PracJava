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
public class Fila<T> {
    
    class Nodo{
        public T item;
        public Nodo siguiente;
    }
    private Nodo inicio;
    private Nodo fin;
    
    
    public Fila()
    {
        this.inicio=null;
        this.fin=null;
    }
    
    
    public void Agregar(T item){
        Nodo nuevo= new Nodo();
        nuevo.item=item;
        nuevo.siguiente=null;
        if(inicio==null){
            inicio=nuevo;
            fin=nuevo;
        }else{
            
            this.fin.siguiente=nuevo;
            fin=nuevo;
        }
        
    }
    public T Eliminar(){
        T item=null;
        if(inicio==null||fin==null){
            
        }else if(inicio==fin){
            item=inicio.item;
            fin=null;
            inicio=null;
        }else{
            item=inicio.item;
            inicio=inicio.siguiente;
        }
        return item;
    }
}
