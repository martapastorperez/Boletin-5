
package boletin5_6;

import javax.swing.JOptionPane;


public class Boletin5_6 {

    public static void main(String[] args) {
    double a =Double.parseDouble(JOptionPane.showInputDialog("Introduzca vendas anuais"));
    Consumo cons=new Consumo();
    cons.consumo(a);
    }
    
}
