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
public abstract class Formas {
    
    private String color;
    private int radio;
    private int largo;
    private int angulo;
    private int area;
    private String dibujar;
    public Formas(){
        
    }
    
    public void establecerColor(String color){
    this.color=color;
}
    public String obtenerColor(){
        return this.color;
    
}
    
     public void establecerRadio(int radio){
    this.radio=radio;
}
    public int obtenerRadio(){
        return this.radio;
    
}
    public void establecerLargo(int largo){
    this.largo=largo;
}
    public int obtenerLargo(){
        return this.largo; 
}
    public void establecerAngulo(int angulo){
    this.angulo=angulo;
}
    public int obtenerAngulo(){
        return this.angulo;   
}
    public void establecerArea(int area){
    this.area=area;
}
    public int obtenerArea(){
        return this.area;
}
    public void establecerDibujar(String dibujar){
    this.dibujar=dibujar;
}
    public String obtenerDibujar(){
        return this.dibujar;
    
}
    public void imprimirInformacion(){
        System.out.println("Color:" + color);
        System.out.println("Radio:" + radio);
        System.out.println("Largo:" + largo);
        System.out.println("Angulo:" + angulo);
        System.out.println("Area:" + area);
         System.out.println("Dibujar:" + dibujar);
        
    
    }
    
    abstract String obtenerInformacionAsignatura();
    
    
   
    
    
    
    
    
    
    
}


