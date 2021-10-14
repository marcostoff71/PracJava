/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrocmpejemp1;

/*
 *
 * @author Mexzjhakob Cyro Eduardo I Toledo Zamora
 */
import java.util.Scanner;

class Calculadora{
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int getResultado(){
        return num1+num2;
    }
}
public class CuadroCmpEjemp1 {

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero=new Scanner(System.in);
        int n1, n2,suma;
        
        
        
        System.out.println("Calculadora de dos números");
        System.out.println("Mexzjhakob Cyro Eduardo I Toledo Zamora");
        
        
        System.out.println("\n\n\tForma numero 1\n\n");
        
        System.out.println("Escribe tu primer número");
        n1=numero.nextInt();
        System.out.println("Escribe tu segundo número");
        n2=numero.nextInt();
        suma=n1+n2;
        System.out.println("La suma de "+n1+" y "+n2+" es :"+suma);
        
        
        System.out.println("\n\n\tForma numero 2\n\n");

        suma=suma(n1,n2);
        System.out.println("La suma de "+n1+" y "+n2+" es :"+suma);
        
        
        System.out.println("\n\n\tForma numero 3\n\n");
        Calculadora cal = new Calculadora();
        cal.setNum1(n1);
        cal.setNum2(n2);
        
        suma=cal.getResultado();
        
        System.out.println("La suma de "+n1+" y "+n2+" es :"+suma);
        
        
    }
    public static int suma(int num1,int num2){
        return num1+num2;
    }
    
}