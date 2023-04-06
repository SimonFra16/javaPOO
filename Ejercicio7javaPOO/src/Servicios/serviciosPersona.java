/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class serviciosPersona {

    Scanner sc = new Scanner(System.in);

    Persona P = new Persona();

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre");
        P.setNombre(sc.next());
        System.out.println("Ingrese edad");
        P.setEdad(sc.nextDouble());
        MayorEdad();
        System.out.println("Ingrese el sexo (H,F,O)");
        P.setSexo(sc.next());
        if (P.getSexo().equalsIgnoreCase("H") || P.getSexo().equalsIgnoreCase("F") || P.getSexo().equalsIgnoreCase("O")) {
        } else {
            System.out.println("Ingresó una opción incorrecta, vuelva a ingresar");
            P.setSexo(sc.next());
        }
        System.out.println("Ingrese el peso");
        P.setPeso(sc.nextDouble());
        System.out.println("Ingrese la altura");
        P.setAltura(sc.nextDouble());
        calcularIMC();
        return P;
    }
    public void calcularIMC(){
        if ((P.getPeso())/(P.getAltura()*P.getAltura())>=20 && (P.getPeso())/(P.getAltura()*P.getAltura())<=25){
            System.out.println("Resultado = 0; Se encuentra en su peso ideal");
    
        } if((P.getPeso())/(P.getAltura()*P.getAltura())<20){
            System.out.println("Resultado = -1; Se encuentra por debajo de su peso ideal");
            
        } if((P.getPeso())/(P.getAltura()*P.getAltura())>25){
        System.out.println("Resultado = 1; Se encuentra por encima de su peso ideal");
        }
    }
    public void MayorEdad(){
        boolean EsMayor = false;
        if (P.getEdad()>=18){
            EsMayor = true; 
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
    }
}

   

                






