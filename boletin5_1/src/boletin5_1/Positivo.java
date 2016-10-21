
package boletin5_1;


public class Positivo {
    //atibutos
    private int num1;
    public Positivo(){
        
    }
    //constructores
    public Positivo (int n1){
        num1=n1;
    }
    //metodos de acceso
    public void darPositivo(int n1){
        if(n1>0){
            System.out.println("É positivo");
        }
        else
        System.out.println("Adiós");
    }
    
 
}
