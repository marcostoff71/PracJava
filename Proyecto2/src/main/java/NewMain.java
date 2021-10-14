/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCO
 */
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num1,num2,resultado;
        
        System.out.println("Ingresa el primer numero: ");
        num1=scan.nextInt();
        
        
        System.out.println("Ingresa el segundo numero: ");
        num2=scan.nextInt();
        
        
        resultado=num1+num2;
        
        System.out.println("Marco Antonio Gonzalez Castelan");
        System.out.println("El resultado de la suma: "+num1+" + "+num2+" es igual = "+resultado);
        
        
        
    }
    
}
