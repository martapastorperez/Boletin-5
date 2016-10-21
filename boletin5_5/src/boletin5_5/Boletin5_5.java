
package boletin5_5;

import javax.swing.JOptionPane;


public class Boletin5_5 {

    public static void main(String[] args) {
     int a=Integer.parseInt(JOptionPane.showInputDialog("Introducir número"));
     int b=Integer.parseInt(JOptionPane.showInputDialog("Introducir número"));
     int c=Integer.parseInt(JOptionPane.showInputDialog("Introducir número"));
     Numeros num=new Numeros();
     num.maior(a, b, c);
    }
    
}
