/*Hacer un programa que solicite 3 calificaciones, y devuelva
la suma de dichas calificaciones.*/

package sumanotas;

import java.util.Scanner;

// @author gabi
public class SumaNotas {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float nota1, nota2, nota3, suma;
        
        //Guardar las 3 notas
        System.out.println("Digite 3 calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        //Sumamos las tres notas
        suma = nota1 + nota2 + nota3;
        
        System.out.println("\n La suma es: "+suma);
    }

}
