
package boletin5_1;

import javax.swing.JOptionPane;

public class Boletin5_1 {

    
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Introduzca número"));
        Positivo pos=new Positivo();
        pos.darPositivo(a);
       
    }
    
}
