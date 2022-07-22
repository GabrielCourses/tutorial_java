/*Si Gillermo tiene N dolares. Luis tiene la mitad de Gillermo
Juan tiene la mitad de lo que tienen Guillermo y Luis juntos
Hacer un programa que sume la cantidad que tienen los 3 juntos*/

package sumadinero;

import java.util.Scanner;

// @author gabi
public class SumaDinero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, suma;
        
        System.out.println("Digite la cantidad tiene Guillermo: ");
        guillermo=entrada.nextFloat();
        
        luis=guillermo/2;
        juan=(guillermo + luis)/2;
        suma=guillermo+luis+juan;
        
        System.out.println("El total de dinero que tienen es: $"+suma);
    }

}
