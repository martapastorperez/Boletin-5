
package boletin5_3;


public class Numeros {
    //atributos
    private int num1;
        public Numeros(){
            
   }
   //constructores
        public Numeros(int n1){
            num1=n1;
        }
    //metodos de acceso
       public void positivo (int n1){
           if(n1>0){
              System.out.println("+"); 
           }
           else if(n1<0)
               System.out.println("-");
           
           else 
               System.out.println("0");
                   
           
       }
       
       
}
