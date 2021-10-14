/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto13;
import java.io.Console;
import java.io.*;
import java.util.*;
import java.util.logging.ConsoleHandler;
/**
 *
 * @author MARCO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static int Fac(int num){
        if(num==1){
            return 1;
        }else{
            return num*Fac(num-1);
        }
    }
    public static int FacIte(int num){
        int resu=1;
        
        for(int i=num;i>=1;i--){
            resu*=i;
        }
       
        return resu;
    }
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int fac=0,resul=0;
        
        System.out.println("\t\t\t======Marco Antonio Gonzalez Castelan=======");
        System.out.println("Programa de Factorial");
        
        
        System.out.println("Ingresa el numero a sacar el factorial: ");
        String le=leer.readLine();
        fac=Integer.parseInt(le);
        
        resul= Fac(fac);
        
        System.out.println("El Factorial de "+fac+" es: "+resul);
    }
    
}
