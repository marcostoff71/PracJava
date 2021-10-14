/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto4;
import java.util.Scanner;
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
        Scanner opcion = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("Practica de ciclos");
            System.out.println("Marco Antonio Gonzalez Castelan");
            System.out.println("Menu");
            System.out.println("1. While");
            System.out.println("2. For");
            System.out.println("3. Ciclo do while");
            System.out.println("0 Terminar");
            op = opcion.nextInt();
            switch (op) {
                case 1:
                    int contador = 1;
                    while (contador <= 10) {
                        System.out.println("Ciclo while " + contador);
                        contador++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Ciclo for: " + i);
                    }
                    break;
                case 3:
                    int i = 0;
                    do {
                        System.out.println("Ciclo Do while: " + i);
                        i++;

                    }while(i<10);
                break;
            }
        } while (op != 0);
    }
}
