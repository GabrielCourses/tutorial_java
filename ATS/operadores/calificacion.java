/*Vamos a calcular la calificación final, tomando un criterio
de 4 evaluaciones con sus correspondientes ponderaciones*/

package calificacionfinal;

import java.util.Scanner;

// @author gabi
public class CalificacionFinal {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float calificacion, participacion, primero, segundo, notaFinal;
        
        System.out.println("Ingrese la nota participación: ");
        participacion=entrada.nextFloat();
        
        System.out.println("Ingrese la nota del primer examen: ");
        primero=entrada.nextFloat();
        
        System.out.println("Ingrese la nota del segundo examen: ");
        segundo=entrada.nextFloat();
        
        System.out.println("Ingrese la nota del examen final: ");
        notaFinal=entrada.nextFloat();
        
        participacion *= 0.10f;
        primero *= 0.25f;
        segundo *= 0.25f;
        notaFinal *= 0.40f;
        
        calificacion = participacion + primero + segundo + notaFinal;
        
        System.out.println("La calificacion final es: "+calificacion);
    }

}
