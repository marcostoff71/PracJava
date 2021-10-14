/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto19palin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class PilaLineal {

    private static final int TAMPILA = 79;
    private int cima;
    private Object[] listaPila;

    public PilaLineal() {
        cima = -1;
        listaPila = new Object[TAMPILA];
    }

    public void insertar(Object elemento) throws Exception {
        if (pilaLlena()) {
            throw new Exception("Desbordamiento pila");
        }
        cima++;
        listaPila[cima] = elemento;
    }

    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        aux = listaPila[cima];
        cima--;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        return listaPila[cima];
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public boolean pilaLlena() {
        return cima == TAMPILA - 1;
    }

    public void limpiarPila() {
        cima = -1;
    }

}

public class NewClass {

    public static void main(String[] args) throws Exception {

        PilaLineal pilaChar;
        char ch;
        boolean esPal;
        String pal;
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Programa de  palíndromos de :Nombre  ");
        try {
            pilaChar = new PilaLineal(); // crea pila vacía
            System.out.print("Teclea la palabra" + " a verificar si es palíndromo: ");
            pal = entrada.readLine();
            // se crea la pila con los caracteres de la palabra
            for (int i = 0; i < pal.length();) {
                Character c;
                c = new Character(pal.charAt(i++));
                pilaChar.insertar(c);
            }
            // se comprueba si es palíndromo
            esPal = true;
            for (int j = 0; esPal && !pilaChar.pilaVacia(); j++) {
                Character c;
                c = (Character) pilaChar.quitar();
                esPal = pal.charAt(j) == c.charValue();
            }
            pilaChar.limpiarPila();
            if (esPal) {
                System.out.println("La palabra " + pal
                        + " es un palíndromo \n");
            } else {
                System.out.println("La palabra " + pal
                        + " no es un palíndromo \n");
            }
        } catch (Exception er) {
            System.err.println("Excepcion: " + er);

        }

    }

    public static void stackDefe() {
        Scanner scan = new Scanner(System.in);
        Stack<String> letras = new Stack<>();

        String palabra = "";

        System.out.println("Programa de Palindromo");
        System.out.println("Teclee la palabra a verificar: ");
        palabra = scan.nextLine().trim();

        for (int i = 0; i < palabra.length(); i++) {
            letras.push(Character.toString(palabra.charAt(i)));
        }

        String pal = "";
        while (!letras.empty()) {
            pal += letras.pop();
        }

  
        if (palabra.equals(pal)) {
            System.out.println("La palabra"+pal+" es palindromo");
        } else {
            System.out.println("La palabra"+pal+" no es palindromo");
        }
    }

}
