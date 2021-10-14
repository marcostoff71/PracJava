package com.mycompany.proyecto6;
import java.util.Scanner;

public class NewClass {
    
    
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int op,f=0,c=0,matriz[][]=null;
        
        System.out.println("Marco Antonio Gonzalez Castelan");
        System.out.println("Practica de matriz");
        
        do{
            menu();
            System.out.println("Seleciona una opcion: ");
            op=scan.nextInt();
            
            switch(op){
                case 1:
                    do{
                        System.out.println("Ingresa el tamaño de las filas: ");
                        f=scan.nextInt();
                        
                        System.out.println("Ingresa el tamaño de las columnas: ");
                        c=scan.nextByte();
                    }while(f<=0||c<=0);
                    matriz=new int[f][c];
                    
                    break;
                case 2:
                    if(matriz!=null){
                        for(int i=0;i<f;i++){
                            for(int j=0;j<c;j++){
                                System.out.println((i+1)+"."+(j+1)+"Dame el valor: ");
                                matriz[i][j]=scan.nextInt();
                            }
                        }
                    }
                    
                    
                    break;
                case 3:
                    
                    if(matriz!=null){
                        System.out.print("[");
                        
                        for(int i=0;i<f;i++){
                            System.out.print("[");
                            for(int j=0;j<c;j++){
                                if(j!=c-1){
                                    System.out.print(matriz[i][j]+",");
                                }else{
                                    System.out.print(matriz[i][j]);
                                }
                            }
                            if(i!=f-1){
                                System.out.println("]");
                            }else{
                                System.out.print("]");
                            }
                            
                        }
                        
                        System.out.println("]");
                    }
                    break;
            }
            
        }while(op!=0);
    }
    public static void menu(){
        System.out.println("1.- Crear matriz");
        System.out.println("2.- LLenar matriz");
        System.out.println("3.- Imprimir matriz");
        System.out.println("0.- Salir");
    }
}
