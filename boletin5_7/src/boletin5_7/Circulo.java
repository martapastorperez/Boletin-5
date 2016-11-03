
package boletin5_7;


public class Circulo {
    private float radio;
    public final double PI=3.14;

    public Circulo(float radio) {
        this.radio = radio;
    }

    Circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getRadio(){
        return radio;
    }

    public void setRadio(float radio){
        this.radio = radio;
    }

    @Override
    public String toString(){
        return "Circulo{" + "radio=" + radio + '}';
    }
    public void calcularArea(float radio){
        System.out.println("Circulo="+(2*PI*radio));
    }
    
}
