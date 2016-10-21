
package boletin5_6;


public class Consumo {
    //atributos
    private double  num1;
    public Consumo (){
        
    }
    //constructores
     public Consumo(double n1){
         num1=n1;
     }
     //metodos de acceso
     public void consumo(double n1){
         if(n1<=100){
             System.out.println("O artigo ten un consumo baixo");
         }
         else if(n1>100&&n1<=500){
             System.out.println("O artigo ten un consumo medio");
         }
         else if(n1>500&&n1<=1000){
             System.out.println("O artigo ten un consumo alto");
         }
         else if(n1>1000){
             System.out.println("O artigo é de primeira necesidade");
         }
     }
   
}
