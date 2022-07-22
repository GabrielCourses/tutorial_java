//Sentencia if

package conif;

import javax.swing.JOptionPane;

// @author gabi
public class ConIf {

    public static void main(String[] args) {
        int numero, dato=5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El número es 5.");
        }
        else{
            JOptionPane.showMessageDialog(null,"El número es diferente de 5.");
        }
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        if(numero != dato){
            JOptionPane.showMessageDialog(null, "El número es diferenete de 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El núemro es igual a 5");
        }
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        
        if(numero > dato){
            JOptionPane.showMessageDialog(null, "El número es mayor a 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es igual o menor que 5");
        }
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        if(numero <= dato){
            JOptionPane.showMessageDialog(null, "El número es menor-igual a 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es mayor a 5");
        }
        }

}
