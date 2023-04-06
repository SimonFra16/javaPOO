/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo_3;

import Entidades.Operacion;
import claseOperacion.OperacionService;

/**
 *
 * @author simon
 */
public class EjPOO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionService OS = new OperacionService();
        Operacion O = OS.crearOperacion();
    }
    
}
