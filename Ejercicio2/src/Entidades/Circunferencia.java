/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    private double radio;
    
    public Circunferencia(double radio){
        this.radio = radio;
        
    }
/**
 * get tomar foto
 * @return foto
 */
    public double getRadio() {
        return radio;
    }
/**ingresa camisa
 * guardar camisas en cajon
 * @param radio 
 */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
