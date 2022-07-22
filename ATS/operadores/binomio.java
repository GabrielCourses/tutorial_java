//Vamos encontrar el valor de elevar un binomio al cuadrado
package binomiocuadrado;

import java.util.Scanner;

// @author gabi
public class BinomioCuadrado {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Ingrese el primer entero: ");
        a=entrada.nextInt();
        
        System.out.println("Ingrese el segundo entero: ");
        b=entrada.nextInt();
        
        c = a*a + b*b + 2*a*b;
        
        System.out.println("El resultado elevar al cuadrado la suma de este par de enteros es: "+c);
    }

}
