
package boletin5_7;

import javax.swing.JOptionPane;

public class Boletin5_7 {
    public static float pedirdato(){
        float a=Float.parseFloat(JOptionPane.showInputDialog("Dato"));
        return a;
    }

    public static void main(String[] args) {
     int op=Integer.parseInt(JOptionPane.showInputDialog("Elegir opción\n Cadrado\nTriangulo \nCirculo "));
     switch(op){
         case 1:float lado=pedirdato();
             Figura fi=new Figura();
             fi.areaCadrado(lado);
             break;
     
     case 2: float base= pedirdato();
             float altura= pedirdato();
             Triangulo tri= new Triangulo();
             tri.calcularArea(base, altura);
             break;
         
     case 3: float radio=pedirdato();
              Circulo cir=new Circulo ();
              cir.calcularArea(radio);
              break;   
    
            
     
     }
    }
    
}
