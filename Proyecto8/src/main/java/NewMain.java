
public class NewMain {

    public static double potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return potencia(base, exponente+1) / base;
        } else {
            return base * potencia(base, exponente-1);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double po=potencia(2,3);
        int num=2;
        int po2=1;
        for(int i=0;i<3;i++){
            po2*=num;
        }
        System.out.println("Potencia de 2 a la 3 es"+po2);
        System.out.println("Programa de recursividad");
        System.out.println("Programa que calcula la potencia de un numero");
        System.out.println("La potencia de 2 es: "+po);
        
    }
    
}
