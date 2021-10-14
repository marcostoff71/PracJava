/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metodosstring;

import java.nio.file.Path;

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
        
        String re=NombreConExtension("marco\\epe.txt");
        String re2=NombreSinExtension("marco\\epe.txt");
        
        System.out.println();
        System.out.println(re);
        System.out.println(re2);
        
        
    }
    public static String NombreConExtension(String path){
        
        int re=path.lastIndexOf("\\")+1;
        System.out.println(re);
        System.out.println(path.length()-re);
        
        return path.substring(re,path.length());
        
    } 
    public static String NombreSinExtension(String path){
        String re=NombreConExtension(path);
        int in=re.lastIndexOf('.');
        
        
        return re.substring(0,in);
        
        
    }
}
