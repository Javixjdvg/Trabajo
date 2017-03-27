/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu3;

import java.util.Scanner;
public class MaquinaPGA {
   Calculadorita resp= new Calculadorita();
    Scanner leer = new Scanner(System.in);
     int n; 
     double promedios[];
     int horas[];
     double peso[];
     double pga[];
     int acum;
     double acum2;
    public void Asig(){ //Ingresar la cantidad de asignaturas
        while(n<=0){ //validar la cantidad de asignaturas, para que sea mayor que 0.
        System.out.println("Ingrese cantidad de asignaturas");
        n= leer.nextInt(); 
        }
        }
    
    public void Prom(){ //Ingresar los promedios de cada asignatura y guardarlos en un arreglo
          this.promedios= new double[this.n];
        for(int i=0;i<this.n;i++){
            while(promedios[i]<1 || promedios[i]>7){
        System.out.println("Ingrese el promedio de la asignatura "+(i+1));
           this.promedios[i]= leer.nextDouble();
            }
        }  
    
    }
    public void Hor(){ //guardar horas de cada asignatura en un arreglo
           this.horas= new int[this.n];
          this.acum=0;
        for(int i=0;i<this.n;i++){
          while(horas[i]<=0){  //Validar para que las horas sean mayores que 0
        System.out.println("Ingrese las horas de la asignatura "+(i+1));
            this.horas[i]= leer.nextInt();  
          }
            this.acum= this.acum + this.horas[i];
            
        }       
    }
    public void Pesoo(){ //se calcula el peso de cada asignatura y se guarda en un arreglo
          this.peso= new double[this.n];
        for (int i = 0; i <this.n; i++) {
         this.peso[i]= resp.division(this.horas[i],this.acum);
            
        }
        
    }
    public void Pga(){ //En un arreglo se ira guardando la multiplicacion del peso por el promedio de cada asignatura, el cual se guardara en un acumulador para calcular el pga.
          this.pga= new double[this.n];
        this.acum2=0;
        for(int i=0;i<this.n;i++){
            
            this.pga[i]=  resp.multiplicacion(this.peso[i],this.promedios[i]);
        
        this.acum2= this.acum2 + this.pga[i];
        }
    System.out.println("El pga es "+acum2);
    
    }
    }
        
        
    
    
    

