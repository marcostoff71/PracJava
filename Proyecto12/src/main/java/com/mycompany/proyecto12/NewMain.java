/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto12;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    static int fibo(int num){
        
        if(num==1){
            return 1;
        }else if(num<=0){
            return 0;
        }else{
            return fibo(num-1)+fibo(num-2);
        }
    }
    static int fibo2(int num){
        
        int a=0,b=1,c=0;
        
        for(int i=0;i<num;i++){
            
            
            a=b;
            b=c;
            c=a+b;
            System.out.println("a: "+a+" b: "+b+" c: "+c);
        }
        
        return c;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Programa de fibonacci con recursion");
        System.out.println("Marco Antonio Gonzalez Castelan");
        System.out.println(fibo(6));
        System.out.println(fibo2(6));
    }
    
}
