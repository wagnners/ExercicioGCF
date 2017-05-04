
import java.util.Scanner;
import org.omg.CORBA.ORB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5105011472
 */
public class Tabuada {
    
   static public Scanner s = new Scanner(System.in);
   static int num = 0;
    static public void informarNumero(){
        System.out.println("Tabuada");
        System.out.println("Informe o número");
        num = s.nextInt();
           }
    
    static public void calcular(int num){
        int cont=0;
        while (cont <=10){
            System.out.println(num + " X " + cont + " = " + num*cont);
            cont++;
        }
    }
  
    public static void main(String[] args) { 
        informarNumero();
        while(num !=-1){
            calcular(num);
            System.out.println("Informe outro número ou -1 para terminar");
            num = s.nextInt();
            
        }
      
        
    }
  
}
