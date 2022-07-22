//La sentencia switch

package pkgswitch;

import javax.swing.JOptionPane;

// @author gabi
public class Switch {

    public static void main(String[] args) {
        int dato;
        
        dato=Integer.parseInt(JOptionPane.showInputDialog("Digite un núemro entre el 1-5: "));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "Este es el número 1");
                break;
            case 2: JOptionPane.showMessageDialog(null, "Este es el número 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "Este es el número 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "Este es el número 4");
                break;
            case 5: JOptionPane.showMessageDialog(null, "Este es el número 5");
                break;
            default: JOptionPane.showMessageDialog(null, "El número no es de 1 a 5");
        }
    }

}
