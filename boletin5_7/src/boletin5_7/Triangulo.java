
package boletin5_7;

import javax.swing.JOptionPane;

public class Triangulo {
    private float base, altura;
    public Triangulo(){
        
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    public void calcularArea(float ba,float al){
        JOptionPane.showInputDialog("Triangulo="+(ba*al/2));
    }
}

