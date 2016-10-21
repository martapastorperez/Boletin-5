
package boletin5_4;

import javax.swing.JOptionPane;


public class Boletin5_4 {

    public static void main(String[] args) {
     
     int a = Integer.parseInt(JOptionPane.showInputDialog("Introduzca peso da persoa 1"));
     int b =Integer.parseInt(JOptionPane.showInputDialog("Introduzca peso da persoa 2"));
     Peso p=new Peso();
      p.diferenzas(a, b);

    }
    
}
