/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto21filaestatica;

import java.util.Arrays;

/**
 *
 * @author MARCO
 */
public class FilaEstatica {
    int max;
    Object[] arr;
    int inicio;
    int fin;
    
    public FilaEstatica(){
        this.inicio=-1;
        this.fin=-1;
        this.max=1;
        arr= new Object[max];
    }
    public void agregar(Object item){
        if(inicio==-1){
            inicio++;
            fin++;
            arr[inicio]=item;
            System.out.println("fin = " + fin);
        }else{
            
            System.out.println("fin = " + fin);
            fin++;
            arr=Arrays.copyOf(arr, fin+1);
            System.out.println("fin = " + fin);
            arr[fin]=item;
        }
    }
    public boolean vacia(){
        return inicio==-1;
    }
    public Object eliminar(){
        
        Object re=null;
        if(inicio==fin){
            re=arr[inicio];
            inicio=-1;
            fin=-1;
            arr= new Object[max];
        }else{
            re=arr[inicio];
            inicio++;
        }
        return re;
        
    }
    public void mostrar(){
        if(!vacia()){
            for(int i=inicio;i<=fin;i++){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
