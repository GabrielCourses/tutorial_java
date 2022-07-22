/*Hacer un programa que a partir de consumir un salario-hora, 
y las horas trabajadas, calcule el salario semanal de un empleado*/

package ejercicio2;

import java.util.Scanner;

// @author gabi

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float salario_hora;
        int horas_trabajadas;
        float salario_sem;
            
        //Guardar el salario_hora, horas_trabajadas
        System.out.println("¿Cual es el salario hora?: ");
        salario_hora = entrada.nextFloat();
        System.out.println("¿Cuantas horas trabajo semanalmente?: ");
        horas_trabajadas=entrada.nextInt();
        
        salario_sem = salario_hora * horas_trabajadas;
        System.out.println("El sueldo semanal es: "+salario_sem);
    }

}
