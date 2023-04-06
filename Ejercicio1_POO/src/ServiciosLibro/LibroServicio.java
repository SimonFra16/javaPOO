/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosLibro;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LibroServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        System.out.println("Ingrese los siguientes datos: ISBN, Titulo, Autor, N° de páginas ");
        int ISBN = leer.nextInt();
        String Titulo = leer.next();
        String Autor = leer.next();
        int NdePag = leer.nextInt();
      
         return new Libro(ISBN, Titulo, Autor, NdePag);
        }
}
