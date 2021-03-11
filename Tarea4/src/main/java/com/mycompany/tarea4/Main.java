/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea4;

import helpers.Doctor;

/**
 *
 * @author Daysi Vega
 */
public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Ingenieria Industrial");
    doctor.imprimirCarrera();
    doctor.establecerEdad(19);
    doctor.establecerNombre("Fabio Salgado");
    doctor.establecerExperiencia(8);
    System.out.println(doctor.obtenerEdad());
    System.out.println(doctor.obtenerNombre());
    System.out.println(doctor.obtenerExperiencia());
    
} 
    
   
}