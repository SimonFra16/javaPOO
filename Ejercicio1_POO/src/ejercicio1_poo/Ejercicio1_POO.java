/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_poo;

import Entidades.Libro;
import ServiciosLibro.LibroServicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio1_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        Libro L1 = ls.crearLibro();
        System.out.println(L1);   
    }   
}
