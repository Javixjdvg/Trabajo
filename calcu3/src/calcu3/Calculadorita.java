
package calcu3;


public class Calculadorita {
    

    
    public double suma(double Num1, double Num2){
    return Num1+Num2;
    }
    public double resta(double Num1, double Num2){
         return Num1-Num2;
    }
    public double multiplicacion(double Num1, double Num2){
         return Num1*Num2;
    }
    public double division(double Num1, double Num2){
         return Num1/Num2;
    }
     
   public void imprimir(double Num1,double Num2){
   
   System.out.println(suma(Num1,Num2));
   System.out.println(resta(Num1,Num2));
   System.out.println(multiplicacion(Num1,Num2));
   System.out.println(division(Num1,Num2));
   }
   
    }

