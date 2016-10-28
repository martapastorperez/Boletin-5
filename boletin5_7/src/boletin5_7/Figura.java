
package boletin5_7;

public class Figura {
    private float lado;
    public Figura(){
        
    }
    public Figura(float lado) {
        this.lado = lado;
    }
    public float getLado(){
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Figura{" + "lado=" + lado + '}';
    
    }
    public void areaCadrado(float la){
        System.out.println("Cadrado="+(la*la));
    }
}
