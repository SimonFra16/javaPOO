/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidades.Circunferencia;
import ServicioCircunferencia.CircunferenciaService;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia c1 = cs.crearCircunferencia();
        
    }
    
} 

