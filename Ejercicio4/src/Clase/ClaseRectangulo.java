/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ClaseRectangulo {
    
    private double base;
    private double altura;

    public ClaseRectangulo() {
    }

    public ClaseRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo (){
        Scanner leer = new Scanner (System.in);
        ClaseRectangulo R1 = new ClaseRectangulo ();
        System.out.println("Ingrese el altura y la base del rectangulo");
        R1.setAltura(leer.nextDouble());
        R1.setBase(leer.nextDouble());
        calcularPerimetro(R1.getAltura(),R1.getBase());
        calcularArea(R1.getAltura(),R1.getBase());
        dibujarRectangulo(R1.getAltura(),R1.getBase());
        
                
    }
    
    public void calcularPerimetro (double A, double B){
       double perimetro = (A+B)*2;
       System.out.println("El perimetro del rectangulo es "+perimetro );
      
    }
    
      public void calcularArea (double A, double B){
       double area = (A*B);
       System.out.println("El área del rectángulo es "+area );
      
    }
    
      public void dibujarRectangulo (double A, double B){
          for (int i = 0; i < Math.floor(A); i++) {
              for (int j = 0; j < Math.floor(B); j++) {
                  
                  if (i==0 || i==Math.floor(A)-1 || j ==0 || j==Math.floor(B)-1){
                       System.out.print("*"); 
                  } else {
                      System.out.print(" ");  
                  }
               
                
              }
            
               System.out.println();
              
          }
               
          }
 
      
      }
      

