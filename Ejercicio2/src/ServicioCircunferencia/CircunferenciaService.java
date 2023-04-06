/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCircunferencia;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CircunferenciaService {
    
    Scanner leer = new Scanner(System.in);
    
    
    public Circunferencia crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        double radio = leer.nextDouble();
        System.out.print("Area = ");
        double A = calcularArea(radio);
        System.out.println(A);
        System.out.print("Perimetro = ");
        double P = calcularPerimetro(radio);
        System.out.println(P);
        
        return new Circunferencia(radio);
    }   
    
    public static double calcularArea(double radio){
        double Area;
        Area = ((Math.PI)*radio*radio);
        return Area;
    }
    public static double calcularPerimetro(double radio){
        double Perimetro;
        Perimetro = (2*(Math.PI)*radio);
        return Perimetro;
    }
}

