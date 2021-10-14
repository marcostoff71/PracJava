
package com.mycompany.proyecto17pilas;
import java.util.Stack;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Stack pila =new Stack();
  
        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");
        pila.push("Elemento 4");
        pila.push("Elemento 5");
        System.out.println("Colocan 5 elementos en la pila ");
        System.out.println("1- Colocar push: "+ pila);
     
         System.out.println("Quitan 3 elementos en la pila ");   
          pila.pop();
         System.out.println("2-Quitar  pop: "+ pila);
         pila.pop();
         System.out.println("3-Quitar pop: "+ pila);
         pila.pop();    
          System.out.println("4-Quitar pop: "+ pila);
       
        boolean y = pila.empty();
        System.out.println("5-Se encuentra vacía empty: "+(y?"Si":"NO"));
         System.out.println("6- El  elemento tope de la pila es:"+pila.peek()); 
        

    }
    
}
