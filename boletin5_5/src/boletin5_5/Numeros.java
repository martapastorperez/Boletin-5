
package boletin5_5;


public class Numeros {
    //atrubitos
    private int num1, num2, num3;
    public Numeros(){
    }
    //constructores
    public Numeros (int n1, int n2, int n3){
        num1=n1;
        num2=n2;
        num3=n3;
    }
    //metodos de acceso
    public void maior(int n1, int n2, int n3){
        if(n1>n2&&n1>n3){
            System.out.println("O número maior é " +n1);
 
        }
        else if (n2>n1&&n2>n3){
            System.out.println("O número maior é " +n2);
        }
        else
            System.out.println("O número maior é " +n3);
    }
}
