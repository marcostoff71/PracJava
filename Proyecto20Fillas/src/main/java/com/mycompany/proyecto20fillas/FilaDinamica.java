/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto20fillas;

/**
 *
 * @author MARCO
 */
public class FilaDinamica<T> {
    
    class Nodo{
        T item;
        Nodo siguiente;
    }
    
    private Nodo inicio,fin;
    
    public FilaDinamica(){
        this.inicio=null;
        this.fin=null;
    }
    
    public void agregar(T item){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.item=item;
        nuevoNodo.siguiente=null;
        if(inicio==null){
            inicio=nuevoNodo;
            fin=nuevoNodo;
        }else{
            fin.siguiente=nuevoNodo;
            fin=nuevoNodo;
        }
        
    }
    public T eliminar(){
        T dato=inicio.item;
        if(inicio==fin){
            inicio=null;
            fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        
        
        
        return dato;
    }
    public boolean vacio(){
        return inicio==null;
    }
    public int count(){
        int con=0;
        Nodo aux=inicio;
        while(aux!=null){
            aux=aux.siguiente;
            con++;
        }
        
        return con;
    }
    public void mostrar(){
        for(Nodo aux=this.inicio;aux!=null;aux=aux.siguiente){
            System.out.print(aux.item+" ");
        }
        System.out.println();
    }
    public void vaciar(){
        inicio=null;
        fin=null;
    }
}
