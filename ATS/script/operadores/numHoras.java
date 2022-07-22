/*Dado un numero de horas, devolver el numero de semanas,
días equivalentes*/

package numhoras;

import java.util.Scanner;

// @author gabi
public class NumHoras {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int horasTot, semanas, dias, horas;
        
        System.out.println("Ingrese el número de horas totales: ");
        horasTot=entrada.nextInt();
        
        semanas = horasTot/168;
        dias = horasTot%168 / 24;
        horas = horasTot%24;
        
        System.out.println("El número de semanas es: "+semanas);
        System.out.println("con: "+dias+" dias");
        System.out.println("y: "+horas+" horas");
    }

}
