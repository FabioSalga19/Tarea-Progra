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
public class Lineas extends Formas {
     public Lineas(){
        establecerLargo(15);
        establecerDibujar("Lineas");
    }

    @Override
   public String obtenerInformacionAsignatura() {
        return "Informacion para las Lineas";
    }
    
    
}
