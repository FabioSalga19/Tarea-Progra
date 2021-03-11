/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Daysi Vega
 */
public class Circulo extends Formas{
     public Circulo(){
        establecerRadio(40);  
        establecerDibujar("Circulo");
    }

    @Override
    public String obtenerInformacionAsignatura() {
        return "Informacion para el Circulo";
    }
    
}
