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
public class Triangulo extends Formas {
    public Triangulo(){
        establecerAngulo(90);
        establecerDibujar("Triangulo");
}

    @Override
   public String obtenerInformacionAsignatura() {
        return "Informacion para el Triangulo";
    }
    
    
}
