
package boletin5_4;


public class Peso {
    //atributos
    private int peso1, peso2;
    public Peso(){ 
    }
    //constructores
    public Peso (int p1, int p2){
        peso1=p1;
        peso2=p2;
    }
    //metodos de acceso
    public void diferenzas (int p1, int p2){
        if(p1>p2){
            System.out.println("A primeira persoa pesa máis ");
        }
        else if (p2>p1)
            System.out.println("A segunda persoa pesa máis ");
        else 
            System.out.println("As duas persoas pesan o mesmo ");
        
            
    }
}
