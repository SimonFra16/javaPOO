/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author npazp
 */
public class ServiciosCafetera {

    Cafetera nesspresso = new Cafetera();

    Scanner leer = new Scanner(System.in);

    public Cafetera Llenar() {

        ServiciosCafetera SC = new ServiciosCafetera();

        boolean Salir = false;

        while (!Salir) {

            System.out.println("Bienvenido al menú, elige una opción:");
            System.out.println("1.Ver cantidad de café \n2.LlenarCafetera \n3.Servir taza \n4. Vaciar cafetera \n5. Agregar Café");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    SC.MostrarCantidad();
                    break;

                case 2:
                    SC.LlenarCafetera();
                    break;

                case 3:
                    SC.ServirTaza();
                    break;

                case 4:
                    SC.VaciarCafetera();
                    break;

                case 5:
                    SC.AgregarCafe();
                    break;
            }
        }
        return nesspresso;

    }
    
    public void MostrarCantidad(){
        System.out.println("La cantidad actual de café es:" + nesspresso.getCantidadActual());
                    
    }
    
    public void LlenarCafetera() {
        if (nesspresso.getCantidadActual()< nesspresso.getCapacidadMaxima()){
          nesspresso.setCantidadActual(nesspresso.getCapacidadMaxima());
            System.out.println("Llenar Cafetera");  
        }
        
        else{
            System.out.println("Cantidad actual:" + nesspresso.getCantidadActual());
        }
        

    }

    public void ServirTaza() {

        System.out.println("Que tamaño desea, seleccione una opción: 1. 50 onzas, 2. 200 onzas, y 3. 500 onzas");

        int tamano = leer.nextInt();

        switch (tamano) {
            case 1:
                if (nesspresso.getCantidadActual() >= 50) {
                    nesspresso.setCantidadActual(nesspresso.getCantidadActual() - 50);
                    System.out.println("Servir cafe de 50 onzas ");
                    System.out.println("La cantidad actual es;" + nesspresso.getCantidadActual());
                } else {
                    System.out.println("No alcanza para servir la taza, se le sirvió: " + nesspresso.getCantidadActual() + "Onzas");
                nesspresso.setCantidadActual(0);
                        
                }
                break;

            case 2:
                if (nesspresso.getCantidadActual() >= 200) {
                    nesspresso.setCantidadActual(nesspresso.getCantidadActual() - 200);
                    System.out.println("Servir cafe de 200 onzas ");
                    System.out.println("La cantidad actual es;" + nesspresso.getCantidadActual());
                } else {
                    System.out.println("No alcanza para servir la taza, se le sirvió: " + nesspresso.getCantidadActual() + "Onzas");
                nesspresso.setCantidadActual(0);
                }
                break;

            case 3:
                if (nesspresso.getCantidadActual() >= 500) {
                    nesspresso.setCantidadActual(nesspresso.getCantidadActual() - 500);
                    System.out.println("Servir cafe de 500 onzas ");
                    System.out.println("La cantidad actual es;" + nesspresso.getCantidadActual());
                } 
                
                else {
                    System.out.println("No alcanza para servir la taza, se le sirvió: " + nesspresso.getCantidadActual() + "Onzas");
                nesspresso.setCantidadActual(0);
                }
                break;
            

        }
            
        
    }
    
    public void VaciarCafetera(){
        nesspresso.setCantidadActual(0);
        System.out.println("La cantidad actual de café es:" + nesspresso.getCantidadActual());
    }
    
    public void AgregarCafe() {
        System.out.println("¿Qué cantidad de onzas de café quieres adicionar a la cafetera?");
        int adicionCafe = leer.nextInt();
        
        if (adicionCafe + nesspresso.getCantidadActual()<= nesspresso.getCapacidadMaxima()){
            nesspresso.setCantidadActual(nesspresso.getCantidadActual()+ adicionCafe);
            System.out.println("Se adicionó: "+ adicionCafe + " onzas, y la cantidad actual es: " + nesspresso.getCantidadActual()+ " onzas");
        }
        
        else{
            System.out.println("No se puede adicionar esa cantidad de café, porque sobrepasa la capacidad máxima");
        }
        
    }
}
