
package boletin5_2;

import javax.swing.JOptionPane;


public class Boletin5_2 {

    
    public static void main(String[] args) {
       short a= Short.parseShort(JOptionPane.showInputDialog("número"));
       short b= Short.parseShort(JOptionPane.showInputDialog("número"));
       Metodos met=new Metodos();
       met.resta(a, b);
       
    }
    
}
