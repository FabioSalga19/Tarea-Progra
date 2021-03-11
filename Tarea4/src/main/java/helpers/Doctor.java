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
public class Doctor {
   
    
    private String carrera; 
    
    private int edad;
    
    private String nombre;
    
    private int experiencia;
    
    public Doctor (String carrera) {
        
        this.carrera=carrera;
        
    }
    
    public void imprimirCarrera(){
        System.out.println(carrera);
    }
    public void establecerEdad( int _edad){
    this.edad=_edad;
} 
    public int obtenerEdad(){
        return edad;
    }
    
    public void establecerNombre( String _nombre){
    this.nombre=_nombre;
} 
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerExperiencia( int _experiencia){
    this.experiencia=_experiencia;
} 
    public int obtenerExperiencia(){
        return experiencia;
    }
}
