/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia;

import helpers.Circulo;
import helpers.Triangulo;
import helpers.Cuadrado;
import helpers.Lineas;

/**
 *
 * @author Daysi Vega
 */
public class Herenci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Triangulo triangulo = new Triangulo();
    Cuadrado cuadrado = new Cuadrado();
    Circulo circulo = new Circulo();
    Lineas lineas = new Lineas();
    
    System.out.println(triangulo.obtenerInformacionAsignatura());
      triangulo.imprimirInformacion();
      
        System.out.println(cuadrado.obtenerInformacionAsignatura());
      cuadrado.imprimirInformacion();
      
       System.out.println(circulo.obtenerInformacionAsignatura());
      circulo.imprimirInformacion();
      
       System.out.println(lineas.obtenerInformacionAsignatura());
      lineas.imprimirInformacion();
      
       
    }
    
}
