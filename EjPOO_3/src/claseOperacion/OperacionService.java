/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseOperacion;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OperacionService {
    Scanner sc = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        System.out.println("Ingrese 2 numeros");
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        System.out.println("SUMA: ");
        double S = crearSuma(numero1,numero2);
        System.out.println(S);
        System.out.println("RESTA: ");
        double R = crearResta(numero1,numero2);
        System.out.println(R);
        System.out.println("MULTIPLICACION: ");
        double M = multiplicar(numero1,numero2);
        System.out.println(M);
        System.out.println("DIVISION: ");
        double D = division(numero1,numero2);
        System.out.println(D);
        
        return new Operacion(numero1,numero2);
    }
    public static double crearSuma(double numero1, double numero2){
        double suma = numero1+numero2;
        return suma;
    }
    public static double crearResta(double numero1, double numero2){
        double resta = numero1-numero2;
        return resta;
    }
    public static double multiplicar(double numero1, double numero2){
        double multiplicacion = numero1*numero2;
        if(numero1==0 || numero2==0){
            System.out.println("¡¡error!! ha multiplicado por 0");
        }
            return multiplicacion;
    }
    
    public static double division(double numero1, double numero2){
        double division = numero1/numero2;
        if(numero2==0){
            System.out.println("¡¡error!! ha dividido entre 0");
        }
        if(numero1==0){
            System.out.println("¡¡error!! ha intentado dividir el 0");
        }
        return division;
    }
}
