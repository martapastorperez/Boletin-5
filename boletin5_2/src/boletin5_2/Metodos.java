
package boletin5_2;


public class Metodos {
    //Atributos
    private short num1, num2;
    public Metodos (){
        
    }
    //constructores
    public Metodos (short n1, short n2){
        num1=n1;
        num2=n2;
    }
    //metodos de acceso
    public void resta (short n1, short n2){
        if(n1>=n2){
            System.out.println("Resta "+ (n1-n2));
          
        }
        else
            System.out.println("Suma "+ (n1+n2));
    }
}
